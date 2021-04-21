import java.util.*;
import java.io.*;
import java.lang.*;
public class Test1
{
	public static int getMin(int[] inputArray){ 
    	   int minValue = inputArray[0]; 
           for(int i=1;i<inputArray.length;i++){ 
           if(inputArray[i] < minValue){ 
           minValue = inputArray[i]; 
        } 
    } 
    return minValue; 
	}
	public static void main(String []args)
	{
	   ArrayList<Integer> list = new ArrayList<Integer>();
      	   list.add(800);
      	   list.add(5500);
      	   list.add(6700);
      	   list.add(9990);
      	   System.out.println("Original list : " + list);
	   int array[] = new int[]{800,5500,6700,9990};
 	   int min = getMin(array);
           System.out.println("Minimum Value is: "+min);
	   
}
}