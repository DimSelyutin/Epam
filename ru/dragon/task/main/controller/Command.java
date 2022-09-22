package ru.dragon.task.main.controller;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;

public interface Command {

    public void execute(UserRequest comandName);


}
