class Rectangle {

	final int width;
	final int height;
	
	Rectangle(int width, int height){
	this.width=width;
	this.height=height;
	}
	
	Rectangle(int width){
	 this.width=width;
	 this.height=width;
	}
	
	int area(Rectangle objc){
	return (width*height);	
	}
	
	int perimeter(Rectangle objc){
	return ((width*2)+(height*2));	
	}	
	
	double diagonal(Rectangle objc){
	return (Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));	
	}
	
	boolean isSquare(Rectangle objc){
		return(width==height);
	}
	
	Rectangle scale(int factor){
		if(factor == 1){
			return this;
		}else{
			return new Rectangle(width*factor,height*factor);
		}
	}
	
	Rectangle sum(int width, int height){
		return new Rectangle(this.width+width,this.height+height);
	}
}