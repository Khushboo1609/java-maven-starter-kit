package com.example.geektrust.model;

import java.util.*;

public class AirportUsers implements IUser {

    private double collections;
    private double  discounts;

    private TreeMap<String ,Integer> hMap;


    private Set<String>fromAirport;

    public AirportUsers() {
        this.collections=0;
        this.discounts=0;
        this.hMap= new TreeMap<>();
        hMap.put("ADULT",0);
        hMap.put("KID",0);
        hMap.put("SENIOR_CITIZEN",0);
        this.fromAirport= new HashSet<>();
    }

    public void updateCollection( double collections){
        this.collections+=collections;
    }

    public void updateDiscount( double discounts){
        this.discounts+=discounts;
    }

    public double getCollection(){
        return this.collections;
    }

    public double getDiscounts(){
        return this.discounts;
    }

    public boolean containsPassenger(String passenger){
        if(fromAirport.contains(passenger)) return true;
        return false;
    }

    public void addPassenger(String passenger){
        fromAirport.add(passenger);
    }

    public void removePassenger(String passenger){
        fromAirport.remove(passenger);
    }

    public void updateCount(String str){
        if(str.equals("ADULT")){
            hMap.put("ADULT",hMap.get("ADULT")+1);
        }

        if(str.equals("KID")){
            hMap.put("KID",hMap.get("KID")+1);
        }
        if(str.equals("SENIOR_CITIZEN")){
            hMap.put("SENIOR_CITIZEN",hMap.get("SENIOR_CITIZEN")+1);
        }

    }
    public int getCount(String str){
            return hMap.get(str);
    }

    public TreeMap<String, Integer> gethMap() {
        return hMap;
    }
}
