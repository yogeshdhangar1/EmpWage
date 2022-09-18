import java. util.*;
public class CalculatetillmaxdayRechaes {
    public static void main(String[] args) {
        int empRatePerhour = 20;
        int totalsalary = 0;
        int salary;
        int emphrs;
        int totalworkingdays= 0,totalEmphrs =0;
        while(totalEmphrs<=100 && totalworkingdays<=20) {
            Random random = new Random();
            int empcheck = random.nextInt(2);
            switch (empcheck) {
                case 1:
                    emphrs = 8;
                    break;
                case 2:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }
            salary =  empRatePerhour*emphrs;
            totalsalary = totalsalary+salary;
            totalEmphrs = totalEmphrs+emphrs;
            totalworkingdays++;
        }
        System.out.println("Monthly wage is:"+ totalsalary);
    }
}