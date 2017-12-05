package cad11;

public class Rectangle {
	private double width;
	private double height;
	
	/**
	 *Constructor of a rectangle with dimensions w x h
	 *@param w the width
	 *@param h the height
	 *@ensures getWidth() == w && getHeight() == h;
	 */
	public Rectangle(double w,double h){
		width = w;
		height = h;
	}
	
	/**
	 *@return the perimeter of the rectangle
	 */
	public double perimeter (){
		return 2*(width+height);
	}
	
	/**
	 *Increases or decresases the size of the rectangle.
	 *@requires perc > 0 && perc <=100;
	 *@ensures getWidth() == \old(getWidth())
	 *perc && getHeight() == \old(getHeight()) perc ;
	 */
	public void resize(int perc) {
		width = width*perc;
		height = height*perc;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Width: "+width+", height: "+height;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
}
