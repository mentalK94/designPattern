package multiThread;

public class Printer {

	private static Printer printer = null;
	private int counter = 0;
	private Printer() {}
	
	public synchronized static Printer getInstance() {
		if(printer == null) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {}
			
			printer = new Printer();
		}
		
		return printer;
	}
	
//	public static Printer getPrinter() {
//		return printer;
//	}
	
	public void print(String str) {
		synchronized (this) {
			counter++;
			System.out.println(str + counter);	
		}
	}
}
