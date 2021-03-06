import java.util.Scanner;
//Program that calculates the pension fund contributions
public class PensionContributionCalculatorSentinel{
	public static void main(String[]args){
		//DECLARE CONSTANTS
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        final int SENTINEL = -1;

        //DECLARE VARIABLES
        int salary, age;
        int contributableSalary;
        double employeeContribution = 0, employerContribution = 0, totalContribution = 0 ;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = in.nextInt();

        
        // Check the contribution cap
        contributableSalary = SALARY_CEILING;

    while (salary != SENTINEL) {
        //Compute various contributions in "double" using a nested-if to handle 4 cases
        System.out.print("Enter the age: ");
        age = in.nextInt();
        if (age <= 55){ //55 and below
        	if(salary >= 6000){
        		employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
        		employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
        	}else if(salary < 6000){ //
            	employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
            	employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
            }
        }else if (age>55 && age<=60){
        	if(salary >= 6000){
        		employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
        		employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
        		}
        	else if(salary < 6000){
        		employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
        		employerContribution = salary * EMPLOYER_RATE_55_TO_60;
        	}
        } else if (age>60 && age<=65){
        	if(salary >= 6000){
        		employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
        		employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
        	}
        	else if(salary < 6000){
        		employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
        		employerContribution = salary * EMPLOYER_RATE_60_TO_65;
        	}
        } else if (age>65){
        	if(salary >= 6000){
        		employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
        		employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
        	}
        	else if(salary < 6000){
        		employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
        		employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
        	}
        }


        totalContribution = employerContribution + employeeContribution;
        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = in.nextInt();
    }if(salary == SENTINEL){
        System.out.println("bye!");	
        }
        in.close();
    }
}