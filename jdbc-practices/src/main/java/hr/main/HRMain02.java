package hr.main;

import java.util.Scanner;

public class HRMain02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("salary[min max]>");
		int minSalary = scanner.nextInt();
		int maxSalary = scanner.nextInt();
		
		List<EmployeeVo> list = new EmployeeDao().findBySalary(minSalary, maxSalary);
		
		// no:firstName:lastName:salary
		// order 큰순
		
		scanner.close();

	}

}
