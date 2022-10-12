public class EmpWageBuilderArray {
    public static final int FullTime = 1;
    public static final int PartTime = 2;
    public int maxHoursInMonth=100;
    private int noOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;
    public int  totalWorkingDays;

    public EmpWageBuilderArray() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    public EmpWageBuilderArray(int noOfWorkingDays) {
    }

    private void addCompany(String Company,int empRatePerHour,int noOfWorkingDays,int maxHoursInMonth){
        companyEmpWageArray[noOfCompany] = new CompanyEmpWage(Company,empRatePerHour,noOfWorkingDays,maxHoursInMonth);
        noOfCompany++;
    }
    private void  computeEmpWage(){
        for(int i =0;i<noOfCompany;i++){
            companyEmpWageArray[i] .setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs =0,totalEmpHrs=0,noOfWorkingDays=0;
        int noOfWorkingDays1 = noOfWorkingDays;
        while(totalEmpHrs<=companyEmpWage.maxHoursInMonth&& totalWorkingDays<(noOfWorkingDays)){
                totalWorkingDays++;
                int empCheck = (int)Math.floor(Math.random()*10)%3;
                switch (empCheck){
                    case FullTime:
                        empHrs = 8;
                        break;
                    case PartTime:
                        empHrs =4;
                        break;
                    default : empHrs =0;
                }
                totalEmpHrs +=empHrs;
            System.out.println("Days :"+noOfWorkingDays+" Hrs is :"+empHrs);
        }
        return totalEmpHrs*companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
        empWageBuilderArray.addCompany("Dmart",29,26,100);
        empWageBuilderArray.addCompany("Reliance",64,34,10);
        empWageBuilderArray.computeEmpWage();
    }
}
