import java.util.Arrays;

public class ArraysLab3 {
	public static void main(String[] args) {
	int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
	int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
	
	int[] sumArr = sum(a1, a2);
	System.out.println("sumArr: " + Arrays.toString(sumArr));
	
	int appendNum = 200;
	int[] appendArr = append(a1, appendNum);
	System.out.println("appendArr: " + Arrays.toString(appendArr));
	
	int removeIdx = 5;
	int[] removeArr = remove(a2, removeIdx);
	System.out.println("removeArr: " + Arrays.toString(removeArr));
	
	int sumOfEvens = sumEven(appendArr);
	System.out.println("sumofEvens: " + sumOfEvens);
	
	rotateRight(a1);
	System.out.println("rotateRight a1: " + Arrays.toString(a1));
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {
		/* Write a method sum that accepts two arrays of integers arr1 and arr2 
		 * and returns an array of integers, in which every element is the 
		 * sum of the elements at that index for the arrays arr1 and arr2.
		 * You can assume arrays arr1 and arr2 have at least one element
		 * each and are the same length.
		 */
		int[] sumArr = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			sumArr[i] = arr1[i] + arr2[i];
		}
		return sumArr;
	}
	
	public static int[] append(int[] arr, int num) {
		/* Write a method append that accepts an array of integers arr of length n 
		 * and an integer num, and returns an array of integers of length n+1 
		 * that consists of the elements of arr with num appended to the end.  
		 * You can assume array arr has at least one element.
		 */
		
		int[] newArr = Arrays.copyOf(arr, arr.length+1);
		newArr[newArr.length-1] = num;
		return newArr;
		
	}
	
	public static int[] remove(int[] arr, int idx) {
		/* Write a method remove that accepts an array of integers arr 
		 * and an integer idx and returns an array of integers consisting
		 * of all of the elements of arr except for the element at index idx
		 * (thus, the returned array has a length of arr.length – 1).  
		 * You can assume arr has at least two elements.
		 */
		
		int[] arr2 = new int[arr.length-1];
		int arr2Pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != idx) {
				arr2[arr2Pos] = arr[i];
				arr2Pos++;
			}	
		}
		return arr2;
	}
		
	public static int sumEven(int[] arr) {
		/* Write a method sumEven that accepts an array of integers arr 
		 * and returns an integer containing the sum of the elements 
		 * at the even indices of arr.  (That means elements at indices 0,2,4,6,8.)
		 * You can assume arr has at least one element.
		 */
		int sum = 0;
		for (int i = 0; i < arr.length; i += 2) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void rotateRight(int[] arr) {
		/* Write a method rotateRight that accepts an array of integers arr 
		 * and does not return a value.  The rotateRight method moves each element
		 * of arr one index to the right (element 0 goes to element 1, element 1 
		 * goes to element 2, …, element n-1 goes to element 0).  
		 * You can assume arr has at least one element.
		 */
		int temp = arr[arr.length-1];
		for (int i = arr.length-2; i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
	}

}
