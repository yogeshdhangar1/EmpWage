public class empWage {
    final int FullTime = 1;
    final int PartTime = 2;
    int empRatePerHour ;
    int noOfWorkingDays;
    int maxHourInMonth;
    String name ;

    public empWage(int empRatePerHour, int noOfWorkingDays, int maxHourInMonth, String name) {
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHourInMonth = maxHourInMonth;
        this.name = name;
    }
    public void multipleCompany() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        System.out.println("The Name Of The Compant is :" + name);
        while (totalEmpHrs < maxHourInMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case FullTime:
                    empHrs = 8;
                    break;
                case PartTime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * empRatePerHour;
            totalEmpWage += empWage;
            System.out.println("Salary of Employee :" + empWage);
        }
        System.out.println("The Total Salary Of  " + name + " Company Is  : " + totalEmpWage);
    }

    public static void main(String[] args) {
        empWage Reliance = new empWage(20,26,100,"Reliance");
        Reliance.multipleCompany();
        empWage dMart = new empWage(20,25,100,"DMart");
        dMart.multipleCompany();
    }
}
