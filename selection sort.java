
public class SORTselection {

	public static void main(String[] args){
		int a[] = {2,9,5,4,8,1,6};
	     
		sort(a);
		
		System.out.println("최종 결과는");
		for(int i=0; i< a.length;i++)
		{
			System.out.print(a[i]+" ");
	    }
	}//메인함수끝
	   
	static void sort(int d[])
	{
		int next, minIndex;
		for(next=0;next<d.length-1;next++)
	    {
			minIndex= min(d,next);//min of index
			swap(d,minIndex,next); //swapping
			
			for(int i=0;i<d.length;i++)
			{
				System.out.print(d[i]+" ");
	           
	         }//sort내부 next
	         System.out.println("\n");
	        
	     }//sort내부 next for문끝
	       
	       
	 }//sort(N)함수 끝
	   
	static int min(int d[],int start)
	{
		int indexofmin=start;
		for(int i=start+1;i<d.length;i++)
		{
			if(d[i]<d[indexofmin])
			{
				indexofmin=i;
	         }//if마지막
	              
	     }//for마지막
	       
	    return indexofmin;
	       
	 }//min함수 마지막
	       
	 static void swap(int[] d,int a,int b)
	 {
		 int t;
		 t=d[b];
		 d[b]=d[a];
		 d[a]=t;
	       
	 }
	       
}//클래스끝
