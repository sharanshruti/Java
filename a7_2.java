import java.util.Scanner;
import java.io.*;


class Personn{
    String name;
    int id;
    double salary;
    
    Personn(String name1, int id1, double salary1){
        name = name1;
        id = id1;
        salary = salary1;
    }
}

public class a7_2 {
    public static void main(String args[]){
        File f = new File("input2.txt");
        File fw = new File("output2.txt");
        FileWriter writer = null;
        String name = null;
        Scanner s = null;
        int i=0;
        int id = -1;
        double salary = 0;
        Personn[] perArray = new Personn[6];
    
    try {
        s = new Scanner(f);
        fw.createNewFile();
        writer = new FileWriter(fw);

        while (s.hasNextLine()) 
        {   if(s.hasNext()){
             name = s.next();
             id = s.nextInt();
             salary = s.nextDouble();
             perArray[i] = new Personn(name,id,salary);
             i++;
            } 
            
        }

        int count =0;
        Personn[] arr = new Personn[2];
        int[] array = new int[i]; 
        for(int a= 0;a < i; a++){
            count = 0;
            for(int b = 0; b < i; b++){
            if(perArray[a].name.equals(perArray[b].name)){
                count++;
            }
             
        }
            array[a] = count;
        }
     
        
         
        int max = 0, min = 0;
         for(int a = 0;a<i;a++){
            if(array[a] > array[max]){
                max = a;
            }
            if(array[a] < array[min]){
                min = a;
            }
     
        }
         
         
        arr[0] = new Personn(perArray[max].name, perArray[max].id,0 );
        arr[1] = new Personn(perArray[min].name, perArray[min].id, 0);
        for(int a= 0;a < i; a++){   
             
                if(perArray[a].name.equals(arr[0].name)){
     
                    arr[0].salary = arr[0].salary + perArray[a].salary ;
                    
                }
                if(perArray[a].name.equals(perArray[min].name)){
                     
                    arr[1].salary = arr[1].salary + perArray[a].salary ;
                     
                }
             
     
        }
     
        writer.write(arr[0].name + "  "+ arr[0].salary+"\n"+arr[1].name + "  "+ arr[1].salary);
        writer.flush();
        writer.close();
    }
     
    catch (FileNotFoundException e) {
        e.printStackTrace();
    } 
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    finally{
        s.close();
    }
}
}