package b25_Constructor;

public class SalaryCalculator {
  public   double hourlyRate;
  public   double stateTaxRate;
  public  double federalTaxRate;
  public double weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
      return   hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
      return   salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", Salary $=" + salary() +
                ", federalTax $=" + federalTax() +
                ", StateTax $=" + stateTax() +
                ", SalaryAfterTax $=" + salaryAfterTax() +
                '}';
    }
}
