package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int iDepth;

	public Cuboid(int iLength, int iWidth, int iDepth) throws Exception {
		super(iLength, iWidth);
		if (iDepth > 0) {
			this.iDepth = iDepth;
		} else {
			throw new IllegalArgumentException("Depth needs to be a positive number.");
		}
	}

	public int getiDepth() {
		return iDepth;

	}

	public void setiDepth(int iDepth) {

		this.iDepth = iDepth;
	}

	public double volume() {

		return super.area() * iDepth;

	}

	@Override
	public double area() {
	
		return 2 * (super.area()) + 2 * (super.getiLength() * iDepth) + 2 * (super.getiWidth() * iDepth);
	}

	@Override
	public double perimeter() throws UnsupportedOperationException {

		throw new UnsupportedOperationException("Perimeter method is invalid.");

	}

	@Override
	public int compareTo(Object obj) {
		return (int) (this.volume() - ((Cuboid) obj).volume());
	}

	public class SortByArea implements Comparator<Cuboid> {

		SortByArea() {

		}

		@Override
		public int compare(Cuboid C1, Cuboid C2) {
			return C1.compareTo(C2);

		}
	}

	public class SortByVolume implements Comparator<Cuboid> {
		SortByVolume() {

		}

		@Override
		public int compare(Cuboid C1, Cuboid C2) {
			return C1.compareTo(C2);

		}
	}

}
