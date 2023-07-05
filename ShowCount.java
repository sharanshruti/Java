import java.util.Scanner;
import java.io.*;
import java.lang.Thread;

class WordCount extends Thread{
	public void run(){
		try{	
			File f1 = new File("poem.txt");
			int count = 0;
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!= null)
			{
				String words[] = s.split(" ");
				if(words[0].equals(""))
					continue;
				else
					count = count+words.length;
	
			}
			fr.close();
			System.out.println("Number of words in the file: "+count);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
class VowelCount extends Thread{
	public void run(){
		try{
			File f1 = new File("poem.txt");
			int count = 0;
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String s;			
			while((s = br.readLine())!= null)
			{
				String words[] = s.split("");
				for(int i=0;i<words.length;i++){
					String w = words[i].toUpperCase();
					if(w.equals("A") || w.equals("E") || w.equals("I") || w.equals("O") || w.equals("U"))
						count++;
				}
			}
			fr.close();
			System.out.println("Number of Vowels in the file: "+count);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();			
		}
		catch(IOException e){
			e.printStackTrace();
		}		
	}
}

class ShowCount{
	public static void main(String[] args) {
		WordCount m = new WordCount();
		m.start();
		VowelCount v = new VowelCount();
		v.start();
	}
}



