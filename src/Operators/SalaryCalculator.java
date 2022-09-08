package Operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50;
        double weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;
        double salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax= salaryBeforeTax * (stateTaxRate/100);
        double federalTax = salaryBeforeTax * (federalTaxRate/100);
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println(salaryBeforeTax);
        System.out.println(stateTax);
        System.out.println(federalTax);
        System.out.println(totalTax);
        System.out.println(salaryAfterTax);

    }
}
/*3. Create a class called SalaryCalculator.java
3.1 declare the following variables:
hourlyRate, weeklyHours,
stateTaxRate, federalTaxRate
3.2 use the given info in above variables to
calculate the followings:
1. salaryBeforeTax
2. stateTax
3. federalTax
4. totalTax
5. salaryAfterTax
Hint: salaryBeforeTax =
hourlyRate * weeklyHour * 52
3.3 use print statement to print each of the
above
Ex:
   hourlyRate = $50
   weeklyHours = 45
   stateTaxRate = 6
(given as percentage, you need to convert to decimal)
   federalTaxRate = 26
(given as percentage, you need to convert to decimal)
    output:
    Gross pay is: $117000
    Federal tax is: $30420
    State tax is: $7020

 */