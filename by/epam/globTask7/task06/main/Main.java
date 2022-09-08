package by.epam.globTask7.task06.main;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        ConsoleOut console = new ConsoleOut();
        time.changeTime(12,61,55);
        console.timePrint(time);
    }
}
