package multiThread;

public class Client {
	private static final int THREAD_NUM = 5;
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

		UserThread[] user = new UserThread[THREAD_NUM];
		for(int i=0; i < THREAD_NUM; i++) {
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
		
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 + "초");		
	}
}
