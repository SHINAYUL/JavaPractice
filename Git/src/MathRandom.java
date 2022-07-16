
public class MathRandom {

	public static void main(String[] args) {
		int num=0;
		
		for(int i=1; i<=20 ; i++) {
		//	System.out.println(Math.random());//0.0<=x<1.0
		//	System.out.println(Math.random()*10);//0.0<=x<10.0
		//	System.out.println((int)(Math.random()*10));//0<=x<10
		//	System.out.println((int)(Math.random()*10)+1);
	
		//Quiz2. -5~5사이의 난수를 20개 출력하시오
			System.out.println((int)(Math.random()*11)-5);
		}
	}		
}
