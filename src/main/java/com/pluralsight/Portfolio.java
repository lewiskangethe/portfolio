package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.util.ArrayList;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner, ArrayList<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    @Override
    public double getValue() {
        return 0;
    }
}
