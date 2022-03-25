package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		for (int i = 0; i < 1000; i++) { // 1000번을 바꿈 
			int tempRan = ran.nextInt(9) + 1;
			int temp = front[0];     // 0자리를 기준으로 숫자를 바꿈.
			front[0] = front[tempRan];
			front[tempRan] = temp;
		}
		
		int answerCnt = 0;
		while (answerCnt < 5) {
			
			for (int i = 0; i < front.length; i++) System.out.print(front[i] + " ");
			System.out.println();
			
			for (int i = 0; i < front.length; i++) System.out.print(back[i] + " ");
			System.out.println();
			
			System.out.print("인덱스1 입력 : ");
			int idx1 = scan.nextInt();
			System.out.print("인덱스2 입력 : ");
			int idx2 = scan.nextInt();
			
			if (front[idx1] == front[idx2]) {
				back[idx1] = front[idx2];
				back[idx2] = front[idx1];
				answerCnt++;
			}
		}
		
		System.out.println("게임 종료");
			
			
	}
	
}
