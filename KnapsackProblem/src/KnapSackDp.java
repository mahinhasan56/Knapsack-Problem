import java.util.ArrayList;
import java.util.*;
public class KnapSackDp{
  public static int v[],w[];
  public  static ArrayList<Integer> list = new ArrayList<Integer>(); 
  public KnapSackDp(int value[],int weight[]){
    this.v=value;
    this.w=weight;
 }
public int knapSack(int n,int W){
  //boolean[] taken = new boolean[n+1];
 boolean [][] taken = new boolean[n+1][W+1];
  int[][] p = new int[n+1][W+1];
  int benefit=0;
        for (int i = 1; i <= n; i++) {
            for (int u = 0; u <= W; u++) {
              if (w[i]<=u){
              if (v[i]+p[i-1][u-w[i]]>p[i-1][u]){
              p[i][u]=v[i]+p[i-1][u-w[i]];
              taken[i][u]=true;
              }
              else{
              p[i][u]=p[i-1][u];
              taken [i][u]=false;
              }
              }
              else{
              p[i][u]=p[i-1][u];
              taken [i][u]=false;
              }
            }
            benefit=p[n][W];
        }
          int k=W;
          for (int j=n;j>0;j--){
          if (taken[j][k]==true){
          list.add(j);
          k=k-w[j];
          }         
        }
        return benefit;
        }
    public ArrayList<Integer> findItems() {
        return list;
    }
}

    
 

