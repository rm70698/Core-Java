package in.co.rays.OOP;

public class TringleEx extends ShapeInheri {
	
	private int base;
	private int height;
	
	public int getBase () {
		return base;
	}
	public void setBase (int base) {
		this.base = base;
	}
	public int getHeight () {
		return height;
	}
	public void setHeight (int height) {
		this.height=height;
	}
	public double area () {
		return 0.5 * height * base;
	}

}
