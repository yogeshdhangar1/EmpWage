import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class empWage {
     static int fullTime = 1;
     static int partTime = 2;
    static  int WorkingEmpHrs =20;
     int empRatePerHour = 20;
     public static void  computeWage(String Company,int empRatePerHour,int WorkingInMonthDays,int workingHourPerMonth) {
         int totalEmpHrs = 0;
         int totalWorkingDays = 0;
         int empHrs = 0;
         int totalEmpWage = 0;
         int workingDaysHourMonth = 100;
         while (totalEmpHrs < WorkingEmpHrs && totalWorkingDays < workingDaysHourMonth) {
             totalWorkingDays++;

             int empCheck = (int) Math.floor(Math.random()*10)%3;
             switch (empCheck) {
                 case 1:
                     empHrs = 8;
                     System.out.println("Employee is Present");
                     System.out.println("Emp Wage :" + empHrs * empRatePerHour);
                     totalEmpHrs += fullTime;
                     System.out.println("Total Emp Wage Is :" + totalEmpHrs * empRatePerHour);
                     break;
                 case 2:
                     empHrs = 4;
                     System.out.println("Employee is Part Time");
                     System.out.println("EmpWage is :" + empHrs * empRatePerHour);
                     totalEmpHrs += partTime;
                     break;
                 case 0:
                     empHrs = 0;
                     System.out.println("Employee is Absent ");
                     totalEmpHrs = 0;
                     totalEmpHrs += empHrs;
                     break;
             }
             totalEmpWage = empHrs * empRatePerHour ;
             totalEmpHrs += empHrs;
             System.out.println( "The salary of Employee is" + empHrs );
         }
         System.out.println("The Total Salary Of  "+Company+" Company Is  : "+totalEmpHrs);
         System.out.println("**********************************************************************************");
     }
    public static void main(String[] args) {
        computeWage("Tcs",20,26,100);
       computeWage("Wipro",20,26,156);
    }
}