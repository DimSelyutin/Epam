package ru.dragon.task.main.controller;

import ru.dragon.task.main.command.Command;
import ru.dragon.task.main.command.CommandName;

public class NoSuchCommand implements Command {
    @Override
    public UserResponce execute(UserRequest request) {
        String cmd = request.getCommandName();
        UserResponce responce = null;
        CommandName cmdName = CommandName.valueOf(cmd);
        responce.setMessage(cmdName.NO_SUCH_COMMAND.toString());

        return responce;
    }
}
