//write a program that takes 10 integers as input.The program 
//places the even integers into an array called evenList
//the odd into an array called oddList and any negative
//values into an array called negativeList.The program will
//display the contents of the 3 arrays after all the integers
//have been entered.
import java.util.Scanner;
class sort_odd_even 
{												
	public static void main(String[] args)		
	{											  
		int a[] = new int[10];					 
		int evenList[] = new int[a.length];		
		int oddList[] = new int[a.length];
		int negativeList[] = new int[a.length];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a ten numbers: ");
		for(int x=0;x<a.length;++x)		
		{
			a[x] = in.nextInt();
			if(a[x]<0)				
				negativeList[x]=a[x];										
			else if(a[x]%2==0)					
				evenList[x]=a[x];	
			else
				oddList[x]=a[x];									
		}
		System.out.print("EvenList: ");
		for(int x=0;x<evenList.length;++x)
		{
			if(evenList[x]!= 0)
			System.out.print(evenList[x]+" ");	
		}
		System.out.println();
		System.out.print("OddList: ");
		for(int x=0;x<oddList.length;++x)
		{
			if(oddList[x] != 0)
			System.out.print(oddList[x]+" ");	
		}
		System.out.println();
		System.out.print("NegativeList: ");
		for(int x=0;x<negativeList.length;++x)
		{
			if(negativeList[x]!= 0)
			System.out.print(negativeList[x]+" ");
		}
	}
}
/*
Enter a ten numbers: -1 2 3 4 5 6 7 8 9 9
EvenList: 2 4 6 8
OddList: 3 5 7 9 9
NegativeList: -1
*/