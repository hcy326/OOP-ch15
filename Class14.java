package Class14;

class PrePaid extends Thread
{
   private static int sum=200;
   
   public void run() {
	   int fee;
	   while(sum>10){
		   fee=(int)(100*Math.random());
		   talk(fee);
	   }
   }
   public synchronized static void talk(int n) {
	   int temp=sum-n;
	   try {
		   sleep ((int)(1000*Math.random()));
	   }
	   catch(InterruptedException e) {
		   
	   }
	   if(temp>0) {
		   sum=temp;
		   System.out.println("通話費"+n+"元，餘額為"+sum+"元");
	   }
   }
}
public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrePaid c1=new PrePaid();
		PrePaid c2=new PrePaid();
		PrePaid c3=new PrePaid();
	    c1.start();
	    c2.start();
	    c3.start();
	}

}
