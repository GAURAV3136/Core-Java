package com.day6_AbstractFinalSuper.finalKeyword;

class FinalVariable
{
	//if any variable is declared as final , we can't change the value of that variable
	
	public final float salary=62000f;
	/*void display()
	{
		salary=65000f;
		System.out.println("Salary is :"+salary);
	
	}*/
	

}

public class FinalOnVariable {

	public static void main(String[] args) {
		FinalVariable f1=new FinalVariable();
		System.out.println(f1.salary);
		//f1.display();

	}

}