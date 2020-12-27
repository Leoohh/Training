class Calculator {

	int value;
	
	
	void plus(int n){
		value += n;
	}
	
	void clear(){
	value = 0;	
	}
	
	void subtract(int n){
		value -= n;
	}
	
	void product(int n){
	value = value*n;	
	}
	
	void power(int n){
	value = (int)Math.pow(value,n);
	}
	
	void divide(int n){
	value = value/n;	
	}
	
	void rest(int n){
	value = value%n;	
	}
}