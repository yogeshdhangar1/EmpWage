public class EmpWageBuilder {
    public static final int Full_Time = 1;
    public static final int Part_Time = 2;
    private final String Company;
    private final int empRatePerHour;
    private final int noOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmpWageBuilder(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        Company = company;
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    private int computeEmpWage(){
        // Variables
        int empHrs = 0,totalEmpHrs = 0,totalWorkingDays=0;
        while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<=noOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case Full_Time:
                    empHrs =8;
                    break;
                case Part_Time:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day:"+totalWorkingDays+"Emp Hrs:"+empHrs);
        }
        return totalEmpHrs*empRatePerHour;
    }

    public static void main(String[] args) {
        EmpWageBuilder Dmart = new EmpWageBuilder("Dmart",20,20,100);
        EmpWageBuilder Reliance = new EmpWageBuilder("Reliance",25,26,120);
        System.out.println("Total Emp Wage For Company is :"+Dmart.Company+"is:"+Dmart.computeEmpWage());
        System.out.println("Total Emp Wage For Company Is :"+Reliance.Company+"is :"+Reliance.computeEmpWage());
    }
}
