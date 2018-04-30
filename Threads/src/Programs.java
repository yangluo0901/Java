
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread =  new MyThread();
		Thread thread_aaa = new Thread(thread);
		thread_aaa.setName("thread__1");
		Thread thread_2= new Thread(thread);
		thread_2.setName("thread__2");
		thread_aaa.start();
		thread_2.start();
		
		for (int i = 0; i <10 ; i++)
		{
			System.out.println("Main thread is running" + "  ----  " +i);
		}
	}

}
