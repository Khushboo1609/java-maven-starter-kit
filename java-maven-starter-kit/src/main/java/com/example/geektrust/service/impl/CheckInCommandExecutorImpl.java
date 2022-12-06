package com.example.geektrust.service.impl;

import com.example.geektrust.constants.Constants;
import com.example.geektrust.model.*;
import com.example.geektrust.service.CommandExecutor;

import java.io.IOException;
import java.util.Map;



public class CheckInCommandExecutorImpl implements CommandExecutor {
    @Override
    public void executeCommand(Map<String, MetroCard> users, AirportUsers airportUsers, CentralUsers centralUsers, Command command) throws IOException {

        String user = command.getCommandParams().get(0);
        String userType= command.getCommandParams().get(1);
        String station = command.getCommandParams().get(2);

        if(station.equals(Constants.AIRPORT)){
            updateUserDetails(users,user,userType,airportUsers,centralUsers);
        }
        else {
            updateUserDetails(users,user,userType,centralUsers,airportUsers);
        }

    }

    public void updateUserDetails(Map<String, MetroCard> users, String user, String userType, IUser user1, IUser user2) {

            if (!user2.containsPassenger(user)) {
                double collection =  updateBalanceAirport(user,users,Constants.nonDiscount(userType));
                user1.updateCollection(collection);
                user1.addPassenger(user);
            }
            else{
                double collection = updateBalanceAirport(user,users, Constants.discount(userType));
                user1.updateCollection(collection);
                user2.removePassenger(user);
                user1.updateDiscount(Constants.discount(userType));
            }
            user1.updateCount(userType);



    }



    public double updateBalanceAirport(String user, Map<String, MetroCard> users, double charges){
        if(charges<users.get(user).getBalance()) {
            double balance = users.get(user).getBalance() - charges;
            users.get(user).setBalance(balance);
            return charges;
        }
        else {
            double penalty = (charges - users.get(user).getBalance())*Constants.PENALITY;
            users.get(user).setBalance(0);
            return charges+penalty;
        }

    }



}
