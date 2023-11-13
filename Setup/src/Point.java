
public class Point extends double4 {

	// Constructor 
	
	Point(double x,double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = 1.0;
	}
	
	Vector subtraction(Point p) {
		Vector v = new Vector(this.x-p.x,this.y-p.y,this.z-p.z);
		return v;
	}
	
	Point add(Vector v) {
		Point p = new Point(this.x+v.x,this.y+v.y,this.z+v.z);
		return p;
	}
	
	Point subtraction(Vector v) {
		Point p = new Point(this.x-v.x,this.y-v.y,this.z-v.z);
		return p;
	}
	
	Point skalar(int x) {
		Point p = new Point(this.x*x,this.y*x,this.z*x);
		return p;
	}
	
	Point skalarDivision(int x){
		Point p = new Point(this.x/x,this.y/x,this.z/x);
		return p;
	}
	
	Point min(Point p ) {
		double x = Math.min(this.x, p.x);
		double y = Math.min(this.y, p.y);
		double z = Math.min(this.z, p.z);
		
		return new Point(x,y,z);
	}
	
	Point max(Point p ) {
		double x = Math.max(this.x, p.x);
		double y = Math.max(this.y, p.y);
		double z = Math.max(this.z, p.z);
		
		return new Point(x,y,z);
	}
	
}
