package pkgShape;



public class Rectangle extends Shape implements Comparable<Object>{
	
	private int iLength;
	private int iWidth;

	public Rectangle(int iLength, int iWidth) throws Exception {
		super();
		if(iLength > 0 && iWidth > 0) {
			this.iLength = iLength;
			this.iWidth = iWidth;
			}
		else {
			throw new IllegalArgumentException("Length or Width are not positive values.");
		}
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	public double area() {
		return (double) iLength * iWidth;
	}
	
	@Override
	public double perimeter(){
		return (double) 2 * iLength + 2 * iWidth;
	}
	
	public int compareTo(Object obj) {
	
		Rectangle rec = (Rectangle) obj;
		return Double.compare(this.area(),rec.area());
	}	

}
