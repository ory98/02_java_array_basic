package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_연습 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int maxScore = 0;
		int temp = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				temp = i;
			} 
		}
		System.out.println(hakbuns[temp] + "번(" + scores[temp] +"점)");
		
	}
	
}
