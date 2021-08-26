package Class07;

class CTest implements Runnable{
	String id;

	public CTest(String str) {
		id=str;
	}
	public void run() {
		for(int i = 1;i<=5;i++) {
		for(int j= 0;j<100000000;j++);
		System.out.println(id+" "+i);
	}
}
}
public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest hi=new CTest("Hello");
		CTest bye=new CTest("Good bye");
		CTest morning=new CTest("Good morning");
		Thread n=new Thread(hi);
		Thread n1=new Thread(bye);
		Thread n2=new Thread(morning);
		n.start();
		n1.start();
		n2.start();
	}

}
