class Aula2 {

	static int max (int a, int b){
		if(a<b){
			return a;
		}
		return b;
	}
	
	static boolean isMultiple (int a, int b){
		if(a%b==0){
			return true;
		}
		return false;
	}
	
	static int abs (int a){
		if(a<0){
			return -a;
		}
		return a;
	}
	
	static int divide (int a, int b){
		return a/b;
	}
	
	static int powerOfTwo(int a){
		return a*a;
	}
	
	static int sumOfNaturalsUpTo (int a){
		int result = 0;
		for(int i = 1; i != a+1; i++){
			result = result+i;
		}
		return result;
	}
	
	static int sumOfEvenNumbersBetween (int a, int b){
		int result = 0;
		for(int i = a; i != b+1; i++){
			if(i%2==0){
				result = result + i;
			}
		}
		return result;
	}
	
	static int firstDigit (int a){
		while(a>=10){
			a = a /10;
		}
		return a;
	}
	
//	static int fibonacci (int a){
//		if(a==0){
//			return 1;
//		}else{
//			if(a==1){
//			return 1;
//			}
//		}elseif{
//			
//		
//	}
	
}