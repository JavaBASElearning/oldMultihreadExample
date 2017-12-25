
public class Notifier implements Runnable {
	
	private Message msg;
    
    public Notifier(Message msg) {
        this.msg = msg;
    }
 
    
    WriteWaiter br = new WriteWaiter();
    
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " ���������");
        try {
        	Thread.sleep(30);
            synchronized (msg) {
                msg.setMsg(name + " ����� Notifier ���������");
                //msg.notify();
                br.run = true;
                br.flag = true;
                 msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	

}
