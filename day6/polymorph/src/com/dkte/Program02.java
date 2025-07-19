package com.dkte;
import java.util.Scanner;
public class Program02 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee e=null;
	System.out.println("1.EMPLOYEE");
	System.out.println("2.MANAGER");
	System.out.println("3.SALESMAN");
	System.out.println("Enter your Choice");
	int choice=sc.nextInt();
	
	switch(choice) {
	
	case 1:
		e=new Employee();
		break;
		
	case 2:
			e=new Manager();
			break;
			
	case 3:
		e=new Salesman();
		break;
		
	default:
		System.out.println("Enter correct choice");
		break;
	}
	
	e.accept(sc);
	e.display();
	
	if(e instanceof Salesman) {
		Salesman s=(Salesman) e;
		s.calTotalCommission();
	}
	}

}
