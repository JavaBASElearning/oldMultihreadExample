import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritetofileTHR implements Runnable {
	
String lineSeparator = System.getProperty("line.separator");
public	int[] str = new int[100];	
	@Override
    public void run() {
		
		System.out.println("Начинаем обработку в отдельном потоке - " + Thread.currentThread().getName());
		
		for (int j = 0; j < 50; j++) {
            
			str[j] = j;
        }
		
		try {
			
		
			for (int i = 0; i < str.length; i++) {
				
				doFileProcessing(i);
				
			}
			
			//Thread.sleep(1000);
			
			
			
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
			
		}
		
		
		System.out.println("Заканчиваем обработку в отдельном потоке - " + Thread.currentThread().getName());
		
		
	}
	
	
	private void doFileProcessing(int y) throws InterruptedException {
		
		
		FileWriter writer= null;
		String result;
		File file =new File("text.txt");
		BufferedWriter bw = null;
	
		try {
			
		
		writer = new FileWriter(file,true);
      	int s =  str[y];
			
			result = Integer.toString(s) + lineSeparator; 
			
			
			System.out.println(Integer.toString(s) + " записано в файл...");
			writer.write(result);

			writer.flush();
        writer.close();

        Thread.sleep(400);
	
		} catch (IOException e2) {
            e2.printStackTrace();
        }
		
		
	}
	
	

}
