package salary;

public class Salary {

    public static void main(String[] args) {
        int monthlySalary = 900;
        int annualSalary = monthlySalary * 12;
       
        
        float taxMonth = monthlySalary * 0.09f;
        System.out.println("the goverment takes per month: " + taxMonth);
        float taxAnnual = annualSalary * (taxMonth * 12);
        System.out.println("the goverment takes per year: " + taxAnnual);
        
        float resultMonth = monthlySalary - taxMonth;
        System.out.println("You get per month: " + resultMonth);
        float resultAnnual = resultMonth * 12;
        System.out.println("You get per year: " + resultAnnual);
    }
    
}
