/**
 * 
 */
package l2;
public class Point3D {
	private double x;
	private double y;
	private double z; 
	public Point3D(double x, double y, double z) { 
		this.x = x;
		this.y = y;
		this.z = z;
		}

	public Point3D() {
		x = 0;
		y = 0;
		z = 0;
		}
	public double getX() {
		return x;
		}
	public void setX(double x) {
		this.x = x;
		} public double getY() {
			return y;
			} 
		public void setY(double y) { 
			this.y = y;
			} 
		public double getZ() {
			return z; 
			} 
		public void setZ(double z) { 
			this.z = z; 
			} 
		public boolean compare(Point3D otherPoint) {
			return x == otherPoint.getX() && y == otherPoint.getY() && z == otherPoint.getZ();
			} 
		public double distanceTo(Point3D otherPoint){
			return (double) Math.round(Math.sqrt( Math.pow(otherPoint.getX() - x, 2) + Math.pow(otherPoint.getY() - y, 2) + Math.pow(otherPoint.getZ() - z, 2) ) * 100) / 100; 
			} 
		}


