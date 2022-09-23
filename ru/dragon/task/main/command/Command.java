package ru.dragon.task.main.command;

import ru.dragon.task.main.controller.UserRequest;

public interface Command {
    void execute(UserRequest request);
}
