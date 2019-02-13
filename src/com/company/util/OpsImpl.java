package com.company.util;

import com.company.Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OpsImpl implements IOps {

    BufferedReader bufferedReader;

    @Override
    public ArrayList<Player> readFromFile(String file, ArrayList<Player> players) {
        try {
            if (bufferedReader == null) {
                bufferedReader = new BufferedReader(new FileReader(
                        file));
                String line = bufferedReader.readLine();
                while (line != null) {
                    String[] dv = line.split(":");
                    players.add(new Player(dv[0], Integer.parseInt(dv[1]), dv[5], Integer.parseInt(dv[6]), Integer.parseInt(dv[7]), dv[2], dv[3], dv[4]));
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return players;
    }

    @Override
    public void writeOnFile(String file, String content) {

    }
}
