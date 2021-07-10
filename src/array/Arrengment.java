package array;

//wap of 
public class Arrengment {
	static int[] int_Arr = { 2, 2, 3, 6, 8, 88, 5, 4,7 };

	private static void arrenge() {
		System.out.println("before arrengement");
		for (int arrayValue : int_Arr) {
			System.out.print(arrayValue + ",");
		}
		System.out.println();
		int index = 0;
		int lastIndex = -1;
		
		  for (int i = 0; i <int_Arr.length; i++) {
		  
		  if(isNumberEven(int_Arr[i]))
		  { 
			  lastIndex++;
			  index= int_Arr[i];
			  int_Arr[i]=int_Arr[lastIndex];
			  int_Arr[lastIndex]=index;
		  }
		  }
		 
		

		//##################Failed in some cases###############
		
		/*
		 * for (int number : int_Arr) {
		 * 
		 * if (isNumberEven(number) == true) { // if
		 * (isNumberEven(int_Arr[int_Arr.length - lastIndex]) == false) {
		 * 
		 * int indexNumber = int_Arr[index]; int_Arr[index] = int_Arr[int_Arr.length -
		 * lastIndex]; int_Arr[int_Arr.length - lastIndex] = indexNumber; lastIndex++;
		 * 
		 * } else {
		 * 
		 * } } index ++; }
		 */
		 
		System.out.println("After Arrengment");
		for (int arrayValue : int_Arr) {
			System.out.print(arrayValue + ",");
		}

	}

	public static boolean isNumberEven(int number) {
		return number > 1 && number % 2 == 0 ? true : false;
	}

	public static void main(String[] args) {

		arrenge();
	}
}
