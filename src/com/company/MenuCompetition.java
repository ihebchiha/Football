package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuCompetition {

    ArrayList<String> menuItems;

    public MenuCompetition() {
        this.menuItems = new ArrayList<String>(
                Arrays.asList("Start Competition", "Search for Teams", "Quit App"));
    }

    public void showMenuCompetition()
    {
        for (int it=0;it<menuItems.size();it++)
        {
            System.out.println((it)+") "+menuItems.get(it));
        }
    }
}
