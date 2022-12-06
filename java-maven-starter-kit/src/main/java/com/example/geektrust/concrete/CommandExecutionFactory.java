package com.example.geektrust.concrete;

import com.example.geektrust.model.Command;
import com.example.geektrust.service.CommandExecutor;
import com.example.geektrust.service.impl.BalanceCommandExecutorImpl;
import com.example.geektrust.service.impl.CheckInCommandExecutorImpl;
import com.example.geektrust.service.impl.PrintSummaryCommandExecutorImpl;

public class CommandExecutionFactory {
    public static CommandExecutor getExecutor(Command task) {
        CommandExecutor executor = null;
        if(task!=null){
            switch(task.getInputCommand()){
                case BALANCE:
                    executor = new BalanceCommandExecutorImpl();
                    break;
                case CHECK_IN:
                    executor = new CheckInCommandExecutorImpl();
                    break;
                case PRINT_SUMMARY:
                    executor = new PrintSummaryCommandExecutorImpl();
                    break;
                default:
                    break;
            }
        }
        return executor;
    }
}
