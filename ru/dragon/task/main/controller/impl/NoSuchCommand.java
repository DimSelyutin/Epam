package ru.dragon.task.main.controller.impl;

import ru.dragon.task.main.command.Command;
import ru.dragon.task.main.command.CommandName;
import ru.dragon.task.main.controller.UserRequest;
import ru.dragon.task.main.controller.UserResponce;

public class NoSuchCommand implements Command {
    @Override
    public UserResponce execute(UserRequest request) {
        String cmd = request.getCommandName();
        UserResponce responce = new UserResponce();

        CommandName cmdName = CommandName.valueOf(cmd);
        responce.setMessage("No such command, pls try again latter!");
        responce.setComandName(cmdName.NO_SUCH_COMMAND.toString());

        return responce;
    }
}
