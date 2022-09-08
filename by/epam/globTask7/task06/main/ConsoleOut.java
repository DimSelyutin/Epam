package by.epam.globTask7.task06.main;

public class ConsoleOut {
    private String hours;
    private String minutes;
    private String seconds;

    public void ConsoleOutLogic(Time time){
        if (time.getHours()<10) {
            hours = 0+""+time.getHours();
        } else {
            hours = ""+time.getHours();
        }

        if (time.getMinutes()<10) {
            minutes = ""+0+time.getMinutes();
        }else {
            minutes = ""+time.getMinutes();
        }
        
        if (time.getSeconds()<10) {
            seconds = ""+0+time.getSeconds();
        } else {
            seconds = ""+time.getSeconds();
        }
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }



    public void timePrint(Time time){
        ConsoleOutLogic(time);
        System.out.println(hours+":"+minutes+":"+seconds);
    }

    
}
