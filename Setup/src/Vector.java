

public class Vector extends double4 {
	// Constructors
	Vector(double x,double y, double z){
		this.w = 0;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	Vector add(Vector v) {
		// Add Just Vector plus Vector
		Vector n = new Vector(this.x +v.x,this.y +v.y,this.z+v.z);
		return n;
	}
	
	Vector sub(Vector v) {
		Vector n = new Vector(this.x -v.x,this.y -v.y,this.z-v.z);
		return n;
		
	}
	
	Vector negation() {
		Vector v = new Vector(-this.x, -this.y, -this.z);
		return v;
	}
	
	// Skalar Operationen
	Vector scalarMultiplication(double d ) {
		Vector x = new Vector(this.x*d, this.y*d, this.z*d);
		return x;
	}
	Vector scalarDivison(double d ) {
		Vector x = new Vector(this.x/d, this.y/d, this.z/d);
		return x;
	}
	
	// Compare
	boolean equal(Vector c) {
		// für ungenauigkeiten
		double epsilon = 0.0000001;
		boolean x = Math.abs(this.x - c.x) < epsilon;
		boolean y = Math.abs(this.y - c.y) < epsilon;
		boolean z = Math.abs(this.z - c.z) < epsilon;
		
		if(x && y && z) {
			return true;
		}
		return false;
	}
	
	
	//Vector values
	double magnitude() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
	}
	double sqrMagnitude() {
		return (Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
	}
	
	Vector normalize() {
		double kehrwert = (1/this.magnitude());
		
		return new Vector(
				this.x*kehrwert,
				this.y*kehrwert,
				this.z*kehrwert);
	}
	
	// dot
	double dot (Vector v){
		return (this.x*v.x)+(this.y*v.y)+(this.z*v.z);
	}
	
	Vector cross(Vector v) {
		double x = this.y * v.z - this.z * v.y;
        double y = this.z * v.x - this.x * v.z;
        double z = this.x * v.y - this.y * v.x;
        
        return new Vector(x,y,z);
	}
	
	
	
	
}
