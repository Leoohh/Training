class Frequencia2019 {

	static final Color AvgGrey = new Color (105,105,105);
	static final Color BLACK = new Color (0,0,0);
	static ColorImage img = new ColorImage ("Untitled.png");

	//Questão 1	
	static int binaryToDecimal(int [] vec){
		int result = 0;
		for(int i = 0;i<vec.length ; i++){
			result = result + (int)(Math.pow(2,vec.length-i-1) * vec[i]);
		}
		return result;
	}

	//Questão 2
	static Color [] grayVector (Color color, int size){
		double adder = (255-color.getR())/(size-1);
		Color [] finale = new Color [size];
		for(int k= color.getR(), i=0; k<= 255 && i != size; k=(int)( k+adder), i++){
			finale[i] = new Color (k,k,k);

		}
		return finale;
	}

	//Questão 3
		static ColorImage frame(ColorImage img, Color gray, int thickness){
		Color[] pallet = grayVector(gray,thickness);
		//parede esquerda
		for(int x = 0; x != thickness; x++)
			for(int y = 0; y != img.getHeight(); y++){
				img.setColor(x,y,pallet[x]);
			}
		//teto
		for(int y =0; y != thickness; y++)
			for(int x=thickness; x != img.getWidth();x++){
				img.setColor(x,y,pallet[y]);
		}
		//parede dierita
		for(int x = img.getWidth()-1; x != img.getWidth()-1-thickness; x--)
			for(int y = thickness; y != img.getHeight(); y++){
				img.setColor(x,y,pallet[img.getWidth()-x-1]);
			}
		//chão
		for(int y = img.getHeight()-1; y != img.getHeight()-1-thickness; y--)
			for(int x = thickness+1; x != img.getWidth()-1-thickness; x++){
				img.setColor(x,y,pallet[img.getHeight()-y-1]);
			}
		return img;
	}

	//Questão 4
	static ColorImage grid(ColorImage img, int lines, int columns){
		for(int x = 0; x != img.getWidth(); x = x+(x/columns))
			for(int y = 0; y != img.getHeight(); y++){
				img.setColor(x,y,BLACK);
			}
		for(int y = 0; y != img.getHeight(); y = y+(y/lines))
			for(int x = 0; x != img.getWidth(); x++){
				img.setColor(x,y,BLACK);
			}
		return img;
	}

//	static ColorImage teste (){
//		ColorImage img = new ColorImage ("Untitled.png");
//		grid(img,10,5);
//		img.getWidth();
//		return img;
//	}
	
	
	
}