import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumtofileTHR implements Runnable {
	
private int val;
public int it;
	
public void run() {
		
		System.out.println("�������� ��������� � ��������� ������ - " + Thread.currentThread().getName());
		
		try {
			
			Thread.sleep(1500);
			
			
			for (int j = 0; j < 10; j++) {
				doReadAndSumProcessing();
		    }
			
			
			
		} catch (InterruptedException e) {
		  e.printStackTrace();
		}
		
		System.out.println("����������� ��������� � ��������� ������ - " + Thread.currentThread().getName());
		
	}	
	


private void doReadAndSumProcessing() throws InterruptedException {
	
	Thread.sleep(9000);
	
	
	try {	
		 
		FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);
//		String fileread = br.readLine();
		
	//	String line = br.readLine();
		 String strLine = null, tmp;
	//	while (line != null) {
		while ((tmp = br.readLine()) != null)
{
			strLine = tmp;
		//	int lastvalue = Integer.parseInt(line);
		//	System.out.println("��������� �������� = " + line);
       
			
			// textArea.append("���"+ lineSeparator);
           // dlm.addElement(line);
            
     //       line = br.readLine();
        }
		
		 String lastLine = strLine;
	//	 int lastvalue = Integer.parseInt(lastLine);
	//	 setval(lastvalue);
		 
		
		 
		  System.out.println("� ��������" + lastLine);	
		br.close();
		fr.close();
		
		} catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }	
	
	
}

}
