import java.util.*;
public class IfTest2 {

	public static void main(String[] args) {
		int score=0;
		char grade='C', opt='0';
		
		System.out.print("점수를 입력하세요.>");
		Scanner sc=new Scanner(System.in);
		score=sc.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.%n",score);
	
	
		if(score >= 90) {
			grade='A';
			if(score >= 98) {
				opt='+';
			}else if(score < 94) {
				opt='-';
			}
		}else if (score >= 80) {
			grade='B';
			if (score>=88) {
				opt='+';
			}else if (score < 84) {
				opt='-';
			}
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);

}
}	