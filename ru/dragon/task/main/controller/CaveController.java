package ru.dragon.task.main.controller;

import ru.dragon.task.main.command.Command;

public class CaveController {
    private final CommandProvider provider = CommandProvider.getInstance();

    public UserResponce doAction(UserRequest request){
        
        String cmdName = request.getCommandName();
        Command cmd = provider.getCommand(cmdName);

        UserResponce responce = cmd.execute(request);
        return responce;

    }
}
