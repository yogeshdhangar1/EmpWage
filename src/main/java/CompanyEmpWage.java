public class CompanyEmpWage {
    public final String company;
    public final int empRatePerHour;
    public final int noOfWorkingDays;
    public int totalEmpWage;
    public int maxHoursInMonth;
    public int totalWorkingDays;

    public CompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int totalEmpWage, int maxHoursInMonth, int totalWorkingDays) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.totalEmpWage = totalEmpWage;
        this.maxHoursInMonth = maxHoursInMonth;
        this.totalWorkingDays = totalWorkingDays;
    }

    public CompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursInMonth = maxHoursInMonth;
        this.company = company;
    }
    public void  setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "company='" + company + '\'' +
                ", empRatePerHour=" + empRatePerHour +
                ", noOfWorkingDays=" + noOfWorkingDays +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}
