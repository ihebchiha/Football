package com.company.util;

import com.company.Player;

import java.util.ArrayList;

public interface IOps {

    public ArrayList<Player> readFromFile(String file, ArrayList<Player> players);

    public void writeOnFile(String file, String content);

}
