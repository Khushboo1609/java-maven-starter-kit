package com.example.geektrust.service.impl;

import com.example.geektrust.constants.Constants;
import com.example.geektrust.model.*;
import com.example.geektrust.service.CommandExecutor;

import java.io.IOException;

import java.util.Map;

public class PrintSummaryCommandExecutorImpl implements CommandExecutor {
    @Override
    public void executeCommand(Map<String, MetroCard> users, AirportUsers airportUsers, CentralUsers centralUsers, Command command) throws IOException {
            System.out.println("TOTAL_COLLECTION" + "  CENTRAL " + (int)centralUsers.getCollection() + " " +(int)centralUsers.getDiscounts());
            System.out.println("PASSENGER_TYPE_SUMMARY");
            printUsers(centralUsers);
            System.out.println("TOTAL_COLLECTION" + "  AIRPORT " + (int)airportUsers.getCollection() + " " +(int)airportUsers.getDiscounts());
            System.out.println("PASSENGER_TYPE_SUMMARY");
            printUsers(airportUsers);
    }

    public void printUsers(IUser users) {
        for (String str : users.gethMap().keySet()) {
            if (users.gethMap().get(str) != 0)
                System.out.println(str + " " + users.gethMap().get(str));
        }
    }







}
