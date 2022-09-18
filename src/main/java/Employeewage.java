import  java .util.*;
public class Employeewage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employeewage Calculation");
        int Fulltime = 1;
        int perhour = 20;
        int emphrs = 0,empwage = 0;
        Random random = new Random();
        int empcheck = random.nextInt(2);
                if(empcheck==Fulltime){
                  emphrs = 8;
                }else{
                    emphrs = 0;
                }
                empwage = emphrs*perhour;
        System.out.println("calculate empwage :"+empwage);
    }
}
