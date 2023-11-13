
public class Color {
	double r = 0;
	double g = 0;
	double b = 0;
	
	
	
	// Constructor
	Color (double r, double g, double b){
		this.r = this.setv(r);
		this.b = this.setv(b);
		this.g = this.setv(g);
	}
	
	Color(){
		this.r = 0;
		this.b = 0;
		this.g = 0;
	}
	
	static Color Red(){
		return new Color(1,0,0);
	}
	static Color Blue(){
		return new Color(0,0,1);
	}
	static Color Green(){
		return new Color(0,1,0);
	}
	static Color White(){
		return new Color(1,1,1);
	}
	static Color Black(){
		return new Color(0,0,0);
	}
	
	// helper Methods
	double setv(double x){
		if(x>1) {
			return 1.0;
		}
		if(x<0) {
			return 0.0;
		}
		else return x;
	}

	Color add(Color c){
		r = this.r +c.r;
		g = this.g +c.g;
		b = this.b +c.b;
		
		return new Color(r,g,b);
	}
	
	Color sub(Color c){
		r = this.r -c.r;
		g = this.g -c.g;
		b = this.b -c.b;
		
		return new Color(r,g,b);
	}
	
	Color mul(double d) {
		r = this.r * d;
		g = this.g * d;
		b = this.b * d;
		
		return new Color(r,g,b);
	}

	Color mul(Color c){
		r = this.r *c.r;
		g = this.g *c.g;
		b = this.b *c.b;
		
		return new Color(r,g,b);
	}
}

