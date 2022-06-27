package employeeWageBuilder;

public class EmployeeAttandance {
	public static void main(String[] args) {
		int Is_full_time = 1;
		int empcheck = (int)( Math.random() * 2);
		if (Is_full_time == empcheck)
				System.out.println("Employee is present");
				else
					System.out.println("Employee is absent");
	}

}
