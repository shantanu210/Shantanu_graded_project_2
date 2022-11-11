package practice_graded_2;

import java.util.*;

class MyComparator implements Comparator{

    public int compare(Object obj1,Object obj2){

     Integer i1=(Integer)obj1;

     Integer i2=(Integer)obj2;

     return i2.compareTo(i1);
    }

}

public class DiskTower{

    public static void main(String[] args){

     Scanner sc=new Scanner(System.in);

     System.out.print(" enter the total no of floors in the building" + "\n");
     int n=sc.nextInt();

     int max=n;

     Queue<Integer> queue=new PriorityQueue<Integer>(new MyComparator());

     int disks[]=new int[n];

     int k;
     for(int i=0;i<n;i++){
    	 k=i+1;
    	 System.out.print("enter the floor size given on day :" + k+"\n");
    	 disks[i]=sc.nextInt();

    	 queue.add(disks[i]);
    	 int j,flag=0,flag1=0;
    	 while(!queue.isEmpty() && queue.peek()==max){
    		 j=i+1;
    		 flag1 =1;
    		 if(flag == 0) {
    			 System.out.print("The construction on Day: " + j + "\n is ");
    			 flag = 1;
    		 }
    	         
          System.out.print(queue.poll() + " ");
          max--;
        }
      
    	if(flag1 == 0) {
    	  System.out.print("No construction possible on this day ");
    	}
        System.out.println();

      }

   }

}