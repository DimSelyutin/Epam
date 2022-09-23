package ru.dragon.task.main.command;

import ru.dragon.task.main.controller.UserRequest;
import ru.dragon.task.main.controller.UserResponce;

public interface Command {
    UserResponce execute(UserRequest request);

    
}
