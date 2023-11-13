import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ColorTest {

	@Test
	void CreateRed() {
		
		Color c = new Color(2,0,0);
		Color r = Color.Red();
		
		Assertions.assertEquals(c.r, r.r);
		Assertions.assertEquals(c.g, r.g);
		Assertions.assertEquals(c.b, r.b);
	}
	@Test
	void CreateBlue() {
		
		Color c = new Color(0,0,10);
		Color r = Color.Blue();
		
		Assertions.assertEquals(c.r, r.r);
		Assertions.assertEquals(c.g, r.g);
		Assertions.assertEquals(c.b, r.b);
	}
	@Test
	void CreateGreen() {
		
		Color c = new Color(0,100000,0);
		Color r = Color.Green();
		
		Assertions.assertEquals(c.r, r.r);
		Assertions.assertEquals(c.g, r.g);
		Assertions.assertEquals(c.b, r.b);
	}
	@Test
	void CreateWhite() {
		
		Color c = new Color(20,230,80);
		Color r = Color.White();
		
		Assertions.assertEquals(c.r, r.r);
		Assertions.assertEquals(c.g, r.g);
		Assertions.assertEquals(c.b, r.b);
	}
	@Test
	void CreateBlack() {
		
		Color c = new Color(0,0,0);
		Color r = Color.Black();
		
		Assertions.assertEquals(c.r, r.r);
		Assertions.assertEquals(c.g, r.g);
		Assertions.assertEquals(c.b, r.b);
	}
	
	@Test
	void mul() {
		
		Color c = new Color(1,0,0);
		c = c.mul(0.5);
		
		Assertions.assertEquals(c.r,0.5);
		
	}

}
