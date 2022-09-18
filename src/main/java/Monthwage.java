import java. util.*;
public class Monthwage {
     public static final int Part_Time = 0;
    public static final int Full_Time = 1;
    public static final int Per_Hour = 20;
    public static final int Work_Day = 20;

    public static void main(String[] args) {
        int workinghrs = 0;
        int empwage = 0;
        int totalwage = 0;
        for (int day = 1;day<=Work_Day;day++) {
            Random random = new Random();
            int empcheck = random.nextInt(2);
            switch (empcheck) {
                case Part_Time:
                    workinghrs = 4;
                    System.out.println("Part time");
                    break;
                case Full_Time:
                    workinghrs = 8;
                    System.out.println("Full Time");
                    break;
                default:
                    workinghrs = 0;

            }
            int wage = workinghrs * Per_Hour;
            System.out.println("Day:" + day +"wage is :"+wage);
            totalwage += wage;
        }
        System.out.println("Total month of wage:"+totalwage);
    }
    }
