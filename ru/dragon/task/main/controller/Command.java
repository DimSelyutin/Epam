package ru.dragon.task.main.controller;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;

public interface Command {
    
    void execute(List<Treasure> tr);

    // void execute(List<Treasure> tr, int x);
}
