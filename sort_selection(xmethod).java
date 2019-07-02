/*
 * Selection sort finds the smallest number in the list and places it first. 
 * It then finds the smallest number remaining and places it second, 
 * and so on until the list contains only a single number. 
 */

import java.util.Scanner;

public class selection_sort{

 public static void main(String[] args) {
  // TODO Auto-generated method stub

 System.out.println("This is a sorting program"); 
 System.out.println("Enter 7 numbers(0 is not accepted):");
 
 int[] array=new int[7];
 int min=0,start=1,swap=0;
 
 Scanner input=new Scanner(System.in);
 System.out.print("Input Array:");
 
 for(int i=0; i<array.length; i++) {//입력 
  array[i]=input.nextInt();
 }
 //2 9 5 4 8 1 6

 for(int j=0; j<array.length; j++) { 
  min=array[start-1]; //min=array[0] = 2
  //fix the compare value 
  for(int i=start; i<array.length; i++) {// start : 
   //start i from 1 //start: 어디서부터 비교를 할지.    
   if(array[i]<min) { //Find Smallest number 
     //i=5일때 성립.
    swap=min;//swap=2 저장
    
    min=array[i];//min=1 
    
    array[i]=swap; // array[5] = 2 
   }
   
  }//for
  
  for(int i=0; i<7; i++) { //print process 과정 출력
   System.out.print(" "+array[i]);
  }
  
  System.out.println();
  array[j]=min; //swap
  start++;
  
 }//for


 System.out.println();
 System.out.print("Print Sorted:");
 for(int i=0; i<7; i++) {
  System.out.print(" "+array[i]);
 }
 
 }

}