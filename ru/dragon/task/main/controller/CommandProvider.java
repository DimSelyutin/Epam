package ru.dragon.task.main.controller;

import java.util.HashMap;
import java.util.Map;
import ru.dragon.task.main.command.Command;
import ru.dragon.task.main.command.CommandName;

public class CommandProvider {
    private Map<CommandName, Command> cmds = new HashMap<>();
    private static CommandProvider INSTANCE;

    private CommandProvider(){
        cmds.put(CommandName.ALL, new AllTreasureCommand());
        cmds.put(CommandName.MOST_ESPENSIVE, new MostEspensiveCommand());
        cmds.put(CommandName.BY_COAST, new ByCoastCommand());
        cmds.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
    }

    public Command getCommand(String cmdr){
        CommandName cmdName;
        Command cmd;
        try {
            cmdName = CommandName.valueOf(cmdr);
            cmd = cmds.get(cmdName);

            if(cmd == null){
                cmd = cmds.get(CommandName.NO_SUCH_COMMAND);
            }
        } catch (Exception e) {
            cmd = cmds.get(CommandName.NO_SUCH_COMMAND);
        }
        return cmd;

    }

    public static CommandProvider getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CommandProvider();
        }
        return INSTANCE;
    }
    
}
