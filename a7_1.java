import java.util.Scanner;
import java.io.*;

class Person{
    String name;
    int id;
    double salary;
    
    Person(String name1, int id1, double salary1){
        name = name1;
        id = id1;
        salary = salary1;
    }
}
public class a7_1{

    public static void main(String args[]){
    File f = new File("input1.txt");
    File fw = new File("output1.txt");
    FileWriter writer = null;
    Scanner sc = null;
    String name = null;
    int id = -1;
    int i=0;
    Person[] perArray = new Person[6];
    double salary = 0;
    try {
        sc = new Scanner(f);
        fw.createNewFile();
        writer = new FileWriter(fw);
        
         while (sc.hasNextLine()) 
         {  if(sc.hasNext()){

            name = sc.next();
            id = sc.nextInt();
            salary = sc.nextDouble();
            perArray[i] = new Person(name,id,salary);
             
            i++;
            }
         }
         for (int a = 1; a < i; ++a) {
            double key = perArray[a].salary;
            String keys = perArray[a].name;
            int keyid = perArray[a].id;
            int b = a - 1;
    
            
            while (b >= 0 && perArray[b].salary > key) {
                perArray[b + 1].id = perArray[b].id;
                perArray[b + 1].name = perArray[b].name;
                perArray[b + 1].salary = perArray[b].salary;
                b = b - 1;
            }
            //arr[b + 1] = key;
            perArray[b + 1].id = keyid;
            perArray[b + 1].name = keys;
            perArray[b + 1].salary = key;
        }
        for(int j=0;j<i;j++){
            writer.write(perArray[j].name+"     "+perArray[j].id+"      "+perArray[j].salary+"\n");
        }
        writer.flush();
        writer.close();
        }
       
     catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } 
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    finally{
        sc.close();
    }
}}  
