class ExerciciosAdicionaisParte1 {

	//	A
	static boolean isLower (char c){
		return (int)c<=122 && (int)c>=97;
	}

	//	B
	static int howManyLower (char [] characteres){
		int result = 0;
		for(int i = 0; i != characteres.length; i++){
			if(isLower(characteres[i])){
				result++;
			}
		}
		return result;
	}

	// 	C
	static char [] lowerVector (char [] letras){
		int counter = 0;
		char [] minusculas = new char [howManyLower(letras)];
		for(int i = 0; i != letras.length; i++){
			if(isLower(letras[i])){
				minusculas[counter]=letras [i];
				counter++;
			}
		}
		return minusculas;
	}

	//	D
	static int howManyLowerInMatrix (char [][] characters){
		int counter = 0;
		for(int i = 0; i != characters.length; i++){
			counter = counter + howManyLower(characters[i]);
		}
		return counter;	
	}

	//	E
	static int howManyInVector (char [] vector, char c){
		int counter = 0;
		for(int i = 0; i != vector.length; i++){
			if(vector[i]==c){
				counter++;
			}
		}
		return counter; 
	}

	//	F
	static boolean areThereMore (char [] v, char c){
		if(howManyInVector(v,c)>1){
			return true;
		}
		return false;

	}

	//	G	
	static char uppercase(char c){
		if(isLower(c)){
			c = (char)(c - 32);
		}
		return c;
	}

	//	H.1
	static char [] uppercaseVector (char [] v){
		for(int i = 0; i != v.length; i++){
			if(isLower(v[i])){
				v[i]=uppercase(v[i]);
			}	
		}
		return v;
	}

	//	H.2
	static char [][] uppercaseMatrix (char [][] v){
		for(int i=0; i != v.length; i++){
			v[i]=uppercaseVector(v[i]);
		}
		return v;
	}

	//	I
	static char [][] uppercaseMatrixToo (char[][] v){
		for(int i = 0; i != v.length; i++)
			for(int j = 0; j != v[i].length; j++){
				v[i][j] = uppercase(v[i][j]);
			}
		return v;
	}

	//	J.1
	static char [] sortPositions(char [] v, int a, int b){
		char aux = v[a];
		v[a] = v[b];
		v[b]=aux;
		return v;
	}

	//	J.2
	static char [] firstLow(char [] v){
		for(int i = 0; i != v.length; i++){
			if(isLower(v[i]) && (int)(v[i])<(int)(v[0]));
			sortPositions(v,0,i);
		}
		return v;
	}

	//	K
	static char [] firstLowToo(char [] v){
		for(int i = 0; i != v.length; i++){
			if(isLower(v[i]) && (int)(v[i])<(int)(v[0]));
			char aux = v[0];
			v[0] = v[i];
			v[i]=aux;	
		}
		return v;	
	}

	//	L
	static char [] bubbleSortChars (char [] v){
		for(int i = 0; i != v.length -1; i++){
			if(v[i]>v[i+1]){
				sortPositions(v,i,i+1);
			}
		}
		return v;
	}

}