package com.example.geektrust.concrete;

import com.example.geektrust.model.AirportUsers;
import com.example.geektrust.model.CentralUsers;
import com.example.geektrust.model.Command;
import com.example.geektrust.model.MetroCard;
import com.example.geektrust.service.CommandExecutor;

import java.io.IOException;
import java.util.*;

public class MetroManagementSystem {
    private final Map<String , MetroCard> users;
    private final AirportUsers airportUsers;
    private final CentralUsers centralUsers;




    public MetroManagementSystem() {
        this.users = new HashMap<>();
        this.airportUsers = new AirportUsers();
        this.centralUsers = new CentralUsers();


    }

    public void fulfillCommand(Command inputCommand) throws IOException {
        CommandExecutor commandExecutor = CommandExecutionFactory.getExecutor(inputCommand);
        try{
            commandExecutor.executeCommand(users,airportUsers,centralUsers, inputCommand);
        }catch(IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
