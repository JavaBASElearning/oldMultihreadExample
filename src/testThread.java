
public class testThread extends Thread {
	
	public int testval;
	public static int sum;
	
	public testThread(String name) {
	        super(name);
	        //this.testval = yi;
	    }
	 
	
	public int getval () {
		
	int	s = this.testval;
		return s;
			
	}
	
	public void setval (int y) {
		
		this.testval = y;
			
				
		}
	
	 
	 @Override
	    public void run() {
	        System.out.println("�������� ��� ����� " + Thread.currentThread().getName());
	        this.sum = 115;
	        try {
	            Thread.sleep(1000);
	            // ��� ������� ����� ��������� ��������� ���� ������
	            doDBProcessing();
	            //setval (100);
	            System.out.println("testval = " + testval);  
	            
	            
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("����������� ��� ����� " + Thread.currentThread().getName());
	    }
	    // ����� ��������������� ���� ������
	    private void doDBProcessing() throws InterruptedException {
	        Thread.sleep(5000);
	    }

}
