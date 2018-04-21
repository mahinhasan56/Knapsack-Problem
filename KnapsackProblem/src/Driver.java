
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver{

 public static void readFile() {
        try {
            Scanner scn = new Scanner(new File("E:\\Eclipse Files\\KnapsackProblem\\src\\Knapsack.txt"));

            while (scn.hasNext()) {
                int noOfElements = scn.nextInt();
                int capacity = scn.nextInt();
                int weight[]=new int[noOfElements + 1];
                int value[]=new int[noOfElements + 1];
                for(int i=0;i<weight.length;i++){
                  weight[i]=scn.nextInt();
                }
               for(int i=0;i<value.length;i++){
                  value[i]=scn.nextInt();
                }
               System.out.println("Item"+" Profit "+"Weight");
                for(int i=0;i<value.length;i++){
                 System.out.println(" "+i+"    "+value[i]+"    "+ weight[i]+ "    ");
                }
       KnapSackDp k=new KnapSackDp(value,weight);
         int x=k.knapSack(noOfElements,capacity);
         System.out.println("Total Benefit: "+x);
        ArrayList<Integer> arr = new ArrayList<Integer>();
         arr=k.findItems();
         System.out.println("Items in KnapSack: " + arr.toString() ); 
            }
            
              

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

}
 public static void main (String[] args){
  readFile();
 }
}