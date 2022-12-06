package com.example.geektrust.service;

import com.example.geektrust.model.AirportUsers;
import com.example.geektrust.model.CentralUsers;
import com.example.geektrust.model.Command;
import com.example.geektrust.model.MetroCard;


import java.io.IOException;
import java.util.Map;
import java.util.Set;

public interface CommandExecutor {
    void executeCommand(Map<String , MetroCard> users, AirportUsers airportUsers, CentralUsers centralUsers, Command command) throws IOException;
}
