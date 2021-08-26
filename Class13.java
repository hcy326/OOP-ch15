package Class13;

class CBank
{
   private static int sum=0;
   public synchronized static void add(int n)
   {
      int tmp=sum;
      tmp=tmp+n;            // 累加匯款總額
      try
      {
         Thread.sleep((int)(1000*Math.random()));   // 小睡0~1秒鐘
      }
      catch(InterruptedException e){}
      sum=tmp;
      System.out.println("sum= "+sum);
  }
}
class CCustomer implements Runnable // CCustomer類別，繼承自Thread類別
{
	
   public void run()        // run() method
   {
      for(int i=1;i<=3;i++)
         CBank.add(100);       // 將100元分三次匯入
   }
}

public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CCustomer c1=new CCustomer();
	     CCustomer c2=new CCustomer();
	     Thread a =new Thread(c1);
	     Thread a1 =new Thread(c2);
	     a.start();
	     a1.start();
	}

}
