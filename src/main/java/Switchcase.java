import java. util.*;
public class Switchcase {
     public static final int Part_Time = 0;
    public static final int Full_Time = 1;
    public static final int Per_Hour = 20;

    public static void main(String[] args) {
        int emphrs = 0;
        int empwage = 0;
        Random random = new Random();
        int empcheck = random.nextInt(2);
        switch (empcheck) {
            case Part_Time:
                emphrs = 4;
                System.out.println("Part time");
                break;
            case Full_Time:
                emphrs = 8;
                System.out.println("Full Time");
                break;
            default:
                emphrs = 0;
        }
        empwage = emphrs * Per_Hour;
        System.out.println("EmpWage Calculate:" + empwage);
    }
    }
