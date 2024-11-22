package class22;

public class SingleThreadExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started execution");
		
		System.out.println("main thread is executing");
		Thread.sleep(5000);
		System.out.println("Main threadd is executing");
		Thread.currentThread().interrupt();
		Thread.sleep(5000);
		
		System.out.println("main thread completed execution");
		

	}

}
