public class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
//		String strVal = iVal+"";
		System.out.println(strVal);
		
		double dVal = 200.0;
		String strVal2 = dVal+"";
		System.out.println(strVal2);
		
		double sum =Integer.valueOf("+"+strVal)
								+Double.valueOf(strVal2);
		double sum2 = Integer.valueOf(strVal)+
								+Double.valueOf(strVal2);
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}

}
