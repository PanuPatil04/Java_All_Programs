package com.dkte;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee e[]=new Employee[10];
	int ch;
	int index=0;
	
	
	
	
	do {
		System.out.println("0.EXIT");
		System.out.println("1.ADD EMPLOYEE:");
		System.out.println("2.DISPLAY ALL EMPLOYEES:");
		System.out.println("3.SEARCH EMPLOYEE WITH ID:");
		System.out.println("4.DISPLAY EMPLOYEES JOINED IN GIVEN YEAR:");
		System.out.println("5.FIND EMPLOYEE WITH MAX SALARY:");   
		System.out.println("6.FIND EMPLOYEE WITH MIN SALARY:");
		System.out.println("Enter Your Choice:");
		ch=sc.nextInt();
		
		switch(ch) {
		
		case 0:
			System.out.println("Exiting...........");
			
			break;
			
		case 1:
			if(index<10) {
				e[index]=new Employee();
				e[index].accept(sc);
				index++;
			}else {
				System.out.println("Cant add employee..:(");
			}
			break;
					
		case 2:
			for(Employee s:e)
				if(s!=null)
					s.display();
			break;
			
		case 3:
			System.out.println("Enter the ID of Employee:");
			int empid=sc.nextInt();
			boolean found=false;
			for(Employee s:e) {
				if(s!=null && s.id==empid) {
					System.out.println("Employee Found :)");
			        s.display();
			        found =true;
				}
			}if(!found)
				System.out.println("Employee not Found :(");
			
			break;
			
		case 4:
			System.out.println("Enter the year to find Employee:");
			int yr=sc.nextInt();
			found=false;
			for(Employee s:e) {
				if(s!=null && s.getDoj().getYear()==yr) {
					System.out.println("Employee Working in Entered year"+yr+ ":");
			        s.display();
			        found =true;
				}
			}if(!found)
				System.out.println("No Employee joined in given year :(");
			
			break;
			
		case 5:
			double maxSal = Double.MIN_VALUE;
			Employee maxEmp = null;
			for (Employee s : e) {
				if (s != null && s.getSal() > maxSal) {
					maxSal = s.getSal();
					maxEmp = s;
				}
			}
			if (maxEmp != null) {
				System.out.println("Employee with Max Salary:");
				maxEmp.display();
			} else {
				System.out.println("No employee records.");
			}
			break;

		case 6:
			double minSal = Double.MAX_VALUE;
			Employee minEmp = null;
			for (Employee s : e) {
				if (s != null && s.getSal() < minSal) {
					minSal = s.getSal();
					minEmp = s;
				}
			}
			if (minEmp != null) {
				System.out.println("Employee with Min Salary:");
				minEmp.display();
			} else {
				System.out.println("No employee records.");
			}
			break;
		}
		
	}while(ch!=0);

	}

}
