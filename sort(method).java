import java.util.Scanner;

public class Sort_selection {
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int [] arr=new int[7];
  
  System.out.println("Enter a 7 numbers of array.:");
  
  Scanner input=new Scanner(System.in);
  
  for(int i=0; i<arr.length; i++) {
   arr[i]=input.nextInt();
  }//for
  sort(arr);

 }

 public static int min(int [] arr,int start) { 
  //start:어디서부터 비교할지를 정하는 변수
  int min_index=start;
  //start i from 1
  for(int i=start+1; i<arr.length-1; i++) {
   if(arr[i]<arr[min_index]) {
    min_index=i;
   }
  }//for

 return min_index;
 }

 public static void swap(int [] arr, int min_index,int j) {
  int swap,min;
  
  swap=arr[j];
  min=arr[min_index];  
  arr[min_index]=swap;
  arr[j]=min;

 }


 public static void sort(int [] arr) {
  int j;
  
  System.out.print("Sorted array:");
  for(j=0; j<arr.length-1; j++) {  
   swap(arr,min(arr,j),j);
   System.out.println();
  
   for(int i=0; i<arr.length; i++) {
    System.out.print(" "+arr[i]);
   
   }//for   
  }//for

 }

}//class 