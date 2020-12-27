
public class Filter {

	ColorImage img;
	Color color;
	int width;
	int height;
	static Color BLACK = new Color (0,0,0);
	
	Filter(Color color, int width, int height){
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	Filter(ColorImage img){
		this.img = img;
		this.color = img.getColor(0,0);
		this.width = img.getWidth();
		this.height = img.getHeight();	
	}
	
	
	
	ColorImage applyFilter (ColorImage img){
		ColorImage base = new ColorImage(width,height);
		int startx = (img.getWidth()-width)/2;
		int starty = (img.getHeight()-height)/2;
		for(int x = startx; x != width; x++)
			for(int y = starty; y != height; y++){
				if(img.getColor(x,y)==this.color){
					base.setColor(x-startx,y-starty,BLACK);
				}else{
					base.setColor(x-startx,y-starty,img.getColor(x,y));
				}
			}
		return base;
	}
	
	 boolean areChanges (ColorImage img){
		for(int x = 0; x != img.getWidth(); x++)
			for(int y = 0; y != img.getHeight();y++){
				if(img.getColor(x,y)==color){
					return true;
				}
			}
		return false;
	}
	
}
