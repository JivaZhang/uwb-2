package det;

public class Determinator {


	
	public static void main(String[] args) {
		
		String m00 = "x11";
		String m01 = "x12";
		String m02 = "x13";
		String m03 = "x14";
		String m10 = "x21";
		String m11 = "x22";
		String m12 = "x23";
		String m13 = "x24";
		String m20 = "x31";
		String m21 = "x32";
		String m22 = "x33";
		String m23 = "x34";
		String m30 = "x41";
		String m31 = "x42";
		String m32 = "x43";
		String m33 = "x44";

		String det = m03  + " * " +  m12  + " * " +  m21  + " * " +  m30  + " - " +  m02  + " * " +  m13  + " * " +  m21  + " * " +  m30 + " - " + 
				m03  + " * " +  m11  + " * " +  m22  + " * " +  m30 + " + " + m01  + " * " +  m13  + " * " +  m22  + " * " +  m30 + " + " + 
				m02  + " * " +  m11  + " * " +  m23  + " * " +  m30 + " - " + m01  + " * " +  m12  + " * " +  m23  + " * " +  m30 + " - " + 
				m03  + " * " +  m12  + " * " +  m20  + " * " +  m31 + " + " + m02  + " * " +  m13  + " * " +  m20  + " * " +  m31 + " + " + 
				m03  + " * " +  m10  + " * " +  m22  + " * " +  m31 + " - " + m00  + " * " +  m13  + " * " +  m22  + " * " +  m31 + " - " + 
				m02  + " * " +  m10  + " * " +  m23  + " * " +  m31 + " + " + m00  + " * " +  m12  + " * " +  m23  + " * " +  m31 + " + " + 
				m03  + " * " +  m11  + " * " +  m20  + " * " +  m32 + " - " + m01  + " * " +  m13  + " * " +  m20  + " * " +  m32 + " - " + 
				m03  + " * " +  m10  + " * " +  m21  + " * " +  m32 + " + " + m00  + " * " +  m13  + " * " +  m21  + " * " +  m32 + " + " + 
				m01  + " * " +  m10  + " * " +  m23  + " * " +  m32 + " - " + m00  + " * " +  m11  + " * " +  m23  + " * " +  m32 + " - " + 
				m02  + " * " +  m11  + " * " +  m20  + " * " +  m33 + " + " + m01  + " * " +  m12  + " * " +  m20  + " * " +  m33 + " + " + 
				m02  + " * " +  m10  + " * " +  m21  + " * " +  m33 + " - " + m00  + " * " +  m12  + " * " +  m21  + " * " +  m33 + " - " + 
				m01  + " * " +  m10  + " * " +  m22  + " * " +  m33 + " + " + m00  + " * " +  m11  + " * " +  m22  + " * " +  m33;
		
		System.out.println(det);
	}

}
