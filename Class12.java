package Class12;

class CTest implements Runnable{
	String id;
	public CTest(String str) {
		id=str;
	}
	public void run() {
		for(int i = 1;i<=5;i++) {
			try{
	            Thread.sleep((int)(100*Math.random()));
	         }
	        catch(InterruptedException e){}	
			System.out.println(id+" "+i);
	}
}
}

public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest hi=new CTest("Hello");
		CTest bye=new CTest("Good bye");
		CTest morning=new CTest("Good morning");
		CTest night=new CTest("Good night");
		Thread m=new Thread(hi);
		Thread m1=new Thread(bye);
		Thread m2=new Thread(morning);
		Thread m3=new Thread(night);
		m.start();
		try {
			m.join();
			m2.start();
			m2.join();
			m3.start();
			m3.join();
			m1.start();
			m1.join();
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("All Threads are finished");
		
	}

}
