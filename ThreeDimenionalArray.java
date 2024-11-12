package java_class;

import java.util.Scanner;

//Create an array to store the ages of students belonging to 2 schools and having 3 classrooms with 5 students in each


public class ThreeDimenionalArray {

	public static void main(String[] args) {
		int age[][][] = new int[2][3][5];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<=age.length-1;i++)//school
		{
			for(int j =0;j<=age[i].length-1;j++)//classroom
			{
				for(int k = 0;k<=age[i][j].length-1;k++)//student
				{
					System.out.println("Enter the ageof the student from school "+ i+" classroom "+j+" student "+k);
					age[i][j][k] = s.nextInt();
					}
			}
		}
		System.out.println("The ages are : ");
		for(int i = 0;i<=age.length-1;i++)//school
		{
			for(int j =0;j<=age[i].length-1;j++)//classroom
			{
				for(int k = 0;k<=age[i][j].length-1;k++)//student
				{
					System.out.println(age[i][j][k]);
					
					}
			}
		}

	}

}
