class Aula1 {
	
	static int timestoo (int a){
		return a*2;
	}
	
	static int diference (int a, int b){
		return a-b;
	}
	
	static double percentage(int n, int total) {
		return n/total;
	}
	
	static double average (int a, int b){
	return (a+b)/2;
	}
	
	static int round (double a){
		return (int)(a+0.5);
	}
	
	static boolean isNegative(int a){
		if(a>=0){
			return true;
		}
		return false;
	}
	
	static boolean isEven(int a){
		return a%2==0;
	}
	
	static boolean isMultiple(int a, int b){
		return a%b==0;
	}
	
	static boolean isDigit(int a){
		if(a>=0 && a<10){
			return true;
		}
		return false;
	}
	
	static boolean isIncluded(int [] v, int a){
		for(int i = 0; i != v.length; i++){
			if(v[i] == a){
				return true;
			}
		}
		return false;
	}
	
	static boolean isExcluded(int [] v, int a){
		return isIncluded(v,a)==false;
	}
	
	static boolean xor(boolean a, boolean b){
		return a!=b;
	}
	
	static boolean vowel(char a){
	return (a=='a' || a=='e' || a=='i' || a== 'o' || a=='u');	
	}
}
