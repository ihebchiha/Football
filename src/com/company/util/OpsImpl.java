package com.company.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpsImpl implements IOps {

    BufferedReader bufferedReader;

    @Override
    public void readFromFile(String file) {
        try {
            if (bufferedReader == null) {
                bufferedReader = new BufferedReader(new FileReader(
                        file));
                String line = bufferedReader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeOnFile(String file, String content) {

    }
}
