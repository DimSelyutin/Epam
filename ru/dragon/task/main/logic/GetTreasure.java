package ru.dragon.task.main.logic;

import ru.dragon.task.main.bean.Cave;


public class GetTreasure implements Command {

    private Cave treasure;


    public GetTreasure(Cave treasure){
        this.treasure = treasure;
    }
    /* (non-Javadoc)
     * @see ru.dragon.task.main.logic.Command#execute()
     */
    @Override
    public void execute() {
        treasure.getTreasures();
    }
    
}
