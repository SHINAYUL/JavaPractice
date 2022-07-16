public class While {

	public static void main(String[] args) {
		int num=12345, sum=0;
		
		
		//10으로 나머지 연산을 하면 마지막 자리를 얻는다.
		//System.out.println(12345%10); 

		
		//num = 12345, 1234,123, 12, 1
	//	for(num=12345;num>0;num=num/10) {
	//		System.out.println(num%10);
	//		sum += num%10; 
	//	}

		while(num>0) {
			sum+=num%10;
			System.out.println("sum= "+sum+",num%10= "+num%10);
			num = num/10;
		}
		
		System.out.println("각 자리수의 합: "+sum);
	}

}
