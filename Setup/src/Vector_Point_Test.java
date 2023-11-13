import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Vector_Point_Test {

    // Vector
	
	@Test
    void additionVectorTest() {
    	Vector v = new Vector(3.0,2.0,1.0);
    	Vector n = new Vector(3.0,1.0,1.0);
    	
    	Vector i = v.add(n);
    	
    	Assertions.assertEquals(6.0,i.x);
    	Assertions.assertEquals(3.0,i.y);
    	Assertions.assertEquals(2.0,i.z);
    }
    
    @Test
    void subtractionVectorTest() {
    	Vector v = new Vector(3.0,2.0,1.0);
    	Vector n = new Vector(3.0,1.0,1.0);
    	
    	Vector i = v.sub(n);
    	
    	Assertions.assertEquals(0.0,i.x);
    	Assertions.assertEquals(1.0,i.y);
    	Assertions.assertEquals(0.0,i.z);
    }
    
    @Test
    void testNegation() {
    	Vector v = new Vector(3.0,2.0,1.0);
    	Vector n = new Vector(-3.0,-2.0,-1.0);
    	
    	Vector h = v.negation();
    	
    	Assertions.assertEquals(h.x,n.x);
    	Assertions.assertEquals(h.y,n.y);
    	Assertions.assertEquals(h.z,n.z);
    }
    
    @Test
    void testskalar1() {
    	Vector v = new Vector(3.0,2.0,1.0);
    	Vector r = v.scalarMultiplication(10.0);
    	
    	Assertions.assertEquals(r.x,30.0);
    	Assertions.assertEquals(r.y,20.0);
    	Assertions.assertEquals(r.z,10.0);
    }
    
    @Test
    void testskalar2() {
    	Vector v = new Vector(3.0,2.0,1.0);
    	Vector r = v.scalarDivison(10.0);
    	
    	Assertions.assertEquals(r.x,0.3);
    	Assertions.assertEquals(r.y,0.2);
    	Assertions.assertEquals(r.z,0.1);
    }
    
    @Test
    void compare(){
    	Vector v = new Vector(3.0,2.0,1.0);
    	Vector s = new Vector(3.0,2.0,1.0);
    	Vector d = new Vector(30.0,2.0,1.0);
    	Assertions.assertTrue(v.equal(s));
    	Assertions.assertFalse(v.equal(d));
    }
    
    @Test
    void magnitudeTest() {
    	Vector v = new Vector(3.0,4.0,0.0);
    	double m = v.magnitude();
    	Assertions.assertEquals(m,5.0);
    }
    
    @Test
    void magnitudeSQRTest() {
    	Vector v = new Vector(3.0,4.0,0.0);
    	double m = v.sqrMagnitude();
    	Assertions.assertEquals(m,25.0);
    }
    
    @Test
    void normalized() {
    	Vector v = new Vector(309.0,4000.0,19090.0);
    	double m = v.normalize().magnitude();
    	Assertions.assertEquals(m,1.0);
    }
    
    @Test
    void dotTest(){
    	Vector v = new Vector(3.0,4.0,1.0);
    	Vector s = new Vector(3.0,4.0,1.0);
    	
    	double n = v.dot(s);
    	Assertions.assertEquals(26.00,n);
    }
    
    @Test
    void crossTest(){
    	Vector v = new Vector(3.0,4.0,1.0);
    	Vector s = new Vector(1.0,4.0,3.0);
    	
    	Vector n = v.cross(s);
    	Vector r = new Vector(8.0,-8.0,8.0);
    	Assertions.assertTrue(n.equal(r));
    }
    
    // Points
    
    @Test
    void pmp() {
    	Point x = new Point(1,2,3);
    	Point p = new Point(1,0,3);
    	
    	Vector r = x.subtraction(p);
    	Vector t = new Vector(0,2,0);
    	
    	Assertions.assertTrue(r.equal(t));
    }
    
    @Test 
    void ps() {
    	Point x = new Point(1,2,3);
    	x = x.skalar(10);
    	Point r = new Point(10,20,30);
    	Assertions.assertTrue(r.equal(x));
    	
    	Point c = new Point(100,200,300);
    	c = c.skalarDivision(10);
    	Assertions.assertTrue(r.equal(c));
    }
    
    @Test
    void pointPlusVector() {
    	Point x = new Point(1,2,3);
    	Vector v = new Vector(2,5,8);
    	Point r = new Point(3,7,11);
    	
    	Assertions.assertTrue(r.equal(x.add(v)));
    	Assertions.assertTrue(x.equal(r.subtraction(v)));
    }
    
    @Test
    void comparepp() {
    	Point x = new Point(1,2,3);
    	Point z = new Point(1,2,3);
    	
    	Assertions.assertTrue(x.equal(z));
    }
    
    
    @Test
    void minMax() {
    	Point x = new Point(4,2,9);
    	Point z = new Point(1,8,3);
    	
    	Point min = new Point(1,2,3);
    	Point max = new Point(4,8,9);
    	
    	Assertions.assertTrue(min.equal(x.min(z)));
    	Assertions.assertTrue(max.equal(z.max(x)));
    }
    
    
    
}
