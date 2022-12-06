package com.example.geektrust.service.impl;

import com.example.geektrust.model.AirportUsers;
import com.example.geektrust.model.CentralUsers;
import com.example.geektrust.model.Command;
import com.example.geektrust.model.MetroCard;
import com.example.geektrust.service.CommandExecutor;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class BalanceCommandExecutorImpl implements CommandExecutor {
    @Override
    public void executeCommand(Map<String , MetroCard> users, AirportUsers airportUsers, CentralUsers centralUsers,  Command command) throws IOException {
        String cardNo= command.getCommandParams().get(0);
        Integer balance = Integer.parseInt(command.getCommandParams().get(1));
        users.put(cardNo,new MetroCard(cardNo,balance));
    }
}
