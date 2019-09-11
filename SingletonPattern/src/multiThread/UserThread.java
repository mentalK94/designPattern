package multiThread;

public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		Printer printer = Printer.getInstance();
		printer.print(Thread.currentThread().getName() + "print using " + printer.toString() + "."); 
	}
}
