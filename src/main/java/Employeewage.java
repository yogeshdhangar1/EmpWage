import  java .util.*;
public class Employeewage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employeewage Computation");
        int Fulltime = 1;
        Random random = new Random();
        int empcheck = random.nextInt(2);
                if(empcheck==Fulltime){
                    System.out.println("Present");
                }else{
                    System.out.println("Absent");
                }

    }
}
