import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Date start = stopWatch.start();
        for (int i = 0;i<1000000;i++){
            System.out.print("");
        };
        Date end = stopWatch.stop();
        System.out.println("Milisecond : "+ stopWatch.getElapsedTime() + " milisecond");
    }
}