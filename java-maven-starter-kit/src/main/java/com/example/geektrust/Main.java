package com.example.geektrust;

import com.example.geektrust.concrete.MetroManagementSystem;
import com.example.geektrust.model.Command;
import com.example.geektrust.service.FileProcesserService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new FileNotFoundException("Input file is not supplied");
            } else {
                MetroManagementSystem mms = new MetroManagementSystem();
                FileProcesserService fileProcesserService = new FileProcesserService(args[0]);
                try {
                    try {
                        Command command = fileProcesserService.processLine();
                        while (command != null) {
                            mms.fulfillCommand(command);
                            command = fileProcesserService.processLine();
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
