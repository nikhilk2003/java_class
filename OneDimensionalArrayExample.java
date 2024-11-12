package java_class;
//Create an array to store the ages of 5 students.
import java.util.Scanner;

public class OneDimensionalArrayExample {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println("Enter the age :");
			a[i] =s.nextInt();
		}

	}

}
