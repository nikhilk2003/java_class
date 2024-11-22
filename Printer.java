package class22;

class Print implements Runnable{
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name+ " Started printing");
		for(int i  = 1;i<=3;i++)
		{
			System.out.println(name + " is printing");
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem occured");
			}
			
		}
		System.out.println(name + " completed printing");
	}
}
public class Printer {

	public static void main(String[] args) {
		Print p = new Print();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		t1.setName("Vanisha");
		t2.setName("Nikhil");
		t3.setName("sindhu");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}

}
