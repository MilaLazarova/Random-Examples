
package arraydemo;
import java.util.*;

public class ArrayDemo {
 private static void test1(){
     Random ran=new Random();
    boolean[] arrd = new boolean[10];
 for(int i=0;i<arrd.length;i++){         
    arrd[i]=ran.nextBoolean();
    System.out.print(arrd[i]+" ");
 }
 }
  private static void test2(){
    char[] arrch=new char[5]; 
    int i=0;
   for(char j='A';j<'E';j++){                //vyvejdane na bukvi v char array
       arrch[i++]=j;
   }
   for(int b=0;b<arrch.length;b++){
     System.out.println(arrch[b]);
   } 
  }
 private static void test3(){
     Random ran=new Random();
 double[] arrd=new double[10];
 for(int i=0;i<arrd.length;i++){
   arrd[i]=ran.nextDouble();
  System.out.println(arrd[i] + " ");
 }
 }
  static void printT(int[] arr){
  for(int i=0;i<arr.length;i++){
  System.out.print(" " + arr[i]);
  
  }
  
  }
  static void test4(){
      int[] arr=new int[10];
      Random ran=new Random();
      int i=0;
      while(i<arr.length){
      arr[i]=ran.nextInt((99-10)+1)+10; //formula za random chislo v interval e:
      System.out.print(arr[i] + " ");   //ran.nextInt((max-min)+1)+min;
      i++;
      
      }
      
  }
   
    public static void main(String[] args) {
      test1();
      System.out.println();
      test2();
   
      test3();  
       System.out.println();
      int[] app={1,5,6,7,8};
       
      printT(app);
       System.out.println();
      test4();
      
    }
    
}
