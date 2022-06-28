package employeeWageBuilder;

public class EmployeePartTime {
	public static void main(String[] args) {
		int is_full_time = 1;
		int is_part_time = 2;
		int wage_per_hour =20;
		int emp_hrs = 0;
		int empcheck = (int)(Math.random() * 3);
		if(empcheck == is_full_time)
	        emp_hrs=8;
		else if(empcheck == is_part_time)
		emp_hrs=4;
	        else
	        	emp_hrs=0;
		int emp_wage = emp_hrs* wage_per_hour ;
			 System.out.println("Employee Daily Wage = "+emp_wage);
			 
	}

}
