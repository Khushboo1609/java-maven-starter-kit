package com.example.geektrust.constants;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Constants {
    public static final double ADULT_CHARGES=200;
    public static final double SENIOR_CHARGES=100;
    public static final double  KIDS_CHARGES=50;
    public static final double ADULT_CHARGES_RETURN=100;
    public static final double SENIOR_CHARGES_RETURN=50;
    public static final double KIDS_CHARGES_RETURN=25;
    public static final double PENALITY= 0.02;

    public static final String ADULT= "ADULT";
    public static final String KID= "KID";
    public static final String SENIOR_CITIZEN= "SENIOR_CITIZEN";
    public static final String AIRPORT= "AIRPORT";


    public static double nonDiscount(String str){

        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap.put("ADULT",ADULT_CHARGES);
        hashMap.put("KID",KIDS_CHARGES);
        hashMap.put("SENIOR_CITIZEN",SENIOR_CHARGES);

        return hashMap.get(str);

    }

    public static double discount(String str){

        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap.put("ADULT",ADULT_CHARGES_RETURN);
        hashMap.put("KID",KIDS_CHARGES_RETURN);
        hashMap.put("SENIOR_CITIZEN",SENIOR_CHARGES_RETURN);

        return hashMap.get(str);

    }



}
