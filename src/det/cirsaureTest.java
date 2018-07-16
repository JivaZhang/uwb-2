package det;

import java.awt.MouseInfo;
import java.util.Arrays;

public class cirsaureTest {

	public static void main(String[] args) {
		
		double mouseX;
		double mouseY;
		
		while(true) {
			mouseX = MouseInfo.getPointerInfo().getLocation().getX();
	        mouseY = MouseInfo.getPointerInfo().getLocation().getY();
	        System.out.println(Arrays.toString(circleToSquare(mouseX, mouseY)) + " \\ " + mouseX + " \\ " + mouseY);
		}

	}

	
	
	
	public static double[] circleToSquare(double u, double v) {
        //when you want to "stretch" points of a circular coordinate plane onto a square one, ex (0.707, 0.707) maps to (1, 1)
        //visit http://squircular.blogspot.com/2015/09/mapping-circle-to-square.html for more info (this is the inverse)

        double u2 = u * u;
        double v2 = v * v;
        double twosqrt2 = 2.0 * Math.sqrt(2.0);
        double subtermx = 2.0 + u2 - v2;
        double subtermy = 2.0 - u2 + v2;
        double termx1 = subtermx + u * twosqrt2;
        double termx2 = subtermx - u * twosqrt2;
        double termy1 = subtermy + v * twosqrt2;
        double termy2 = subtermy - v * twosqrt2;
        double x = (0.5 * Math.sqrt(termx1) - 0.5 * Math.sqrt(termx2));
        double y = (0.5 * Math.sqrt(termy1) - 0.5 * Math.sqrt(termy2));
        return new double[]{termy1, termy2};
    }
	
	
	
}
