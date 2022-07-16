import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		int input=0, answer=0;
		
		//1~100 사이의 임의의 수를 저장
		answer =(int)(Math.random()*10)+1;
		System.out.println("answer: "+answer);
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요");
			input = sc.nextInt();
		
			if(input>answer) { 
				System.out.println("더 작은 수를 입력하세요");
			}else if(input<answer) {
				System.out.println("더 큰 수를 입력하세요");
			}
		}while(input!=answer);
		
		System.out.println("정답입니다");
	}

}
