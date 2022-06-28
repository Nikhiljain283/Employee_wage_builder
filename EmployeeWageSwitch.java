package employeeWageBuilder;

public class EmployeeWageSwitch {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static void main(String[] args) {
		int emp_hrs=0;
		int emp_rate_per_hr =20;
		int empcheck = (int)(Math.random()*3);
		switch (empcheck) {	
		case IS_PART_TIME:
		emp_hrs=4;
		break;
		case IS_FULL_TIME:
			emp_hrs=8;
			break;
			default:
				emp_hrs=0;
				}
	
		int emp_wage=emp_hrs*emp_rate_per_hr;
		System.out.println("employee wage = "+emp_wage);
		
	}

}
