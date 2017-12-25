
public class WriteWaiter implements Runnable{
	
	private Message msg;
	private long counter = 0;
	volatile boolean run = true;
	volatile boolean flag = true;
    
    public WriteWaiter(Message m){
        this.msg = m;
    }
    
    public WriteWaiter(){
    	Message msg1 = new Message("сука");
    	this.msg = msg1;
    }
    
    @Override
    public void run() {
    	
    	String name = Thread.currentThread().getName();
        synchronized (msg) {
        	System.out.println("Waiting for data...");
        	System.out.println(run);
        	System.out.println(flag);
        //	while (run) {
        		
        	//	 System.out.println(name + " ждем вызов метода notify: " + System.currentTimeMillis());
        //        counter++;
                 try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                 System.out.println("We are waiting ...  " + counter);
        		
        		
        	while (!flag) {	
        	try{
        		
        		System.out.println("wait");
        		msg.wait();
        	
        	/*	System.out.println(name + " ждем вызов метода notify: " + System.currentTimeMillis());
                counter++;
                Thread.sleep(500);
                System.out.println("We are waiting ...  " + counter);
               	// if(flag) msg.wait(); 	  */ 
        	 
                
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        	}
        //	}
        //
         //   System.out.println(name + " был вызов метода notify: " + System.currentTimeMillis());
            // обработаем наше сообщение
            System.out.println(name + " : " + msg.getMsg());
            
           
            
            
        	}
        	}
       
	

}
