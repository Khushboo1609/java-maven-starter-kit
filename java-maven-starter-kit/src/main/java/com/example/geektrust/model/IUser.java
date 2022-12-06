package com.example.geektrust.model;

import java.util.Set;
import java.util.TreeMap;

public interface IUser {
    public void updateCollection( double collections);

    public void updateDiscount( double discounts);

    public double getCollection();

    public double getDiscounts();

    public boolean containsPassenger(String passenger);

    public void addPassenger(String passenger);

    public void removePassenger(String passenger);

    public int getCount(String str);

    public void updateCount(String str);

    public TreeMap<String, Integer> gethMap();

}
