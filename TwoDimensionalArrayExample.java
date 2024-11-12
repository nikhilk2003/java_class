package java_class;
//Create an array to store ages of students belonging to two classes
//2claarooms 5 students in each classrooms.
import java.util.Scanner;

public class TwoDimensionalArrayExample {
	

	public static void main(String[] args) {
		int age[][] = new int[2][5];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i<=age.length-1;i++)//classroom
		{
			for(int j = 0; j<=age[i].length-1;j++)//students
			{
				System.out.println("Enter the age of class "+ i + " Student " + j);
				age[i][j] = s.nextInt();
				
			}
		}
		System.out.println("The ages are :");
		for(int i = 0; i<=age.length-1;i++)//classroom
		{
			for(int j = 0; j<=age[i].length-1;j++)//students
			{
				System.out.println(age[i][j]);
				
			}
		}
		

	}

}
