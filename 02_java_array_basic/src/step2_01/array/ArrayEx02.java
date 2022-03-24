package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 배열 사용 예시1
		int[] test1     = new int[3];
		double[] test2  = new double[10];
		char[] test3    = new char[5];
		boolean[] test4 = new boolean[7];
		String[] test5  = new String[500];
		
		test5[0] = "data1";
		test5[1] = "data2";
		test5[2] = "data3";
		
		// 배열 사용 예시2 : 축약형(배열을 생성할때 1번만 가능)
		int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
		String[] arr2 = {"하나", "둘", "셋", "넷", "다섯"};
		char[] arr3 = {'O', 'X', 'X','O', 'O'};
		
		// arr1 = {1, 2, 3, 4, 5};  // Error
		// arr3 = {'O', 'O', 'O'};  // Error
		
		// 배열 사용 예시3 : 다른 문법과의 조합
		int[] arr4 = new int[100];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = i + 1;
		}
		
		// (참고) Arrays.toString(배열명) : 배열이 익숙해진 후에 사용 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		
	}

}
