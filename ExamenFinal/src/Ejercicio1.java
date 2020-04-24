
import java.util.Scanner;

public class Ejercicio1 {

	public static int [] randomArray (int elements, int upper, int lower){
		int [] arr;
		//Checking the size
		if (elements>0)
			arr = new int [elements];
		else
			arr = new int [25];
		//Checking the bounds
		if (upper<lower){
			int aux = upper;
			upper = lower;
			lower = aux;
		}
		//Generating the array
		for (int ii=0; ii<arr.length; ii++)
			arr[ii]= (int) (Math.random()*(upper-lower)+lower);
		return arr;
	}
	
	public static int [] totallyRandomArray (){
		int elements = (int) (Math.random()*1000+1);
		int upper = (int) (Math.random()*1000+1);
		int lower = (int) (Math.random()*1000+1);
		//We reuse the created method
		return randomArray(elements, upper, lower);
	}
		
	public static int [] shrink  (int [] arr){
		int [] res;
		if (arr.length%2==0)
			res = new int [arr.length/2];
		else
			res = new int [arr.length/2+1];
		for (int ii=0; ii<arr.length; ii=ii+2){
			if (ii<arr.length-1)
				res[ii/2] = arr[ii]+arr[ii+1];
			else
				res[ii/2] = arr[ii];
		}
		return res;		
	}
	
	public static int [] invert (int [] arr){
		int [] res = new int [arr.length];
		for (int ii=0; ii<arr.length; ii++){
			res[ii]=arr[arr.length-1-ii];
		}
		return res;
	}
	public static void print (int [] arr){
		for (int ii=0; ii<arr.length; ii++)
			System.out.print(arr[ii]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] arr = null;
		do {
			System.out.println("How do you want to fill the array?");
			System.out.println("1) Partially random");
			System.out.println("2) Totally random");
			int option = sc.nextInt();
			switch (option){
			case 1: System.out.println("Enter the number of elements");
					int ele = sc.nextInt();
					System.out.println("Enter the upper bound");
					int up = sc.nextInt();
					System.out.println("Enter the lower bound");
					int low = sc.nextInt();
					arr = randomArray(ele, up, low);
					break;
			case 2: arr = totallyRandomArray();
					break;
				default: System.out.println("Please, enter 1 or 2!");
			}
		}
		while (arr==null);
		System.out.println("The generated array is ");
		print (arr);
		String option;
		do {
			System.out.println("Enter the option");
			System.out.println("A) Shrink the array");
			System.out.println("B) Invert the array");
			System.out.println("C) Quit");
			option = sc.next();
			switch (option.toUpperCase()){
			case "A": arr = shrink(arr);
						print(arr);
						break;
			case "B": arr = invert(arr);
						print(arr);
						break;
			case "C": break;
			default: System.out.println("Enter a right option!");
			}
		}
		while (!option.equalsIgnoreCase("C"));
		System.out.println("Thanks");
		sc.close();
	}

}
