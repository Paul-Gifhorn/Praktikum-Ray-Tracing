
public class double4 {
	
		// Variables
		double x,y,z,w;
		
		
		//compare
		boolean equal(double4 c) {
			// für ungenauigkeiten
			double epsilon = 0.0000001;
			boolean x = Math.abs(this.x - c.x) < epsilon;
			boolean y = Math.abs(this.y - c.y) < epsilon;
			boolean z = Math.abs(this.z - c.z) < epsilon;
			boolean w = Math.abs(this.w - c.w) < epsilon;
			
			if(x && y && z && w) {
				return true;
			}
			return false;
		}
}
