package det;

import java.awt.PointerInfo;
import java.util.Arrays;

public class UWBfunction {

	
	public static double[] getXYZ(double x0, double y0, double z0, 
								 double x1, double y1, double z1,
								 double x2, double y2, double z2,
								 double x3, double y3, double z3,
								 double l0, double l1, double l2, double l3 ) {

		
		//////////////////////////////////////////////////////////// Get x11 through x45 (rows and columns start at 0)
		
		//first row														0
		double m00 = x0 * x0
				   + x1 * x1
				   + x2 * x2
				   + x3 * x3;
		
		double m01 = x0 * y0
				   + x1 * y1
				   + x2 * y2
				   + x3 * y3;
		
		double m02 = x0 * z0
				   + x1 * z1
				   + x2 * z2
				   + x3 * z3;
		
		double m03 = x0
				   + x1
				   + x2
				   + x3;
		
		double m04 = x0 * (x0 * x0 + y0 * y0 + z0 * z0 - l0 * l0)
				   + x1 * (x1 * x1 + y1 * y1 + z1 * z1 - l1 * l1)
				   + x2 * (x2 * x2 + y2 * y2 + z2 * z2 - l2 * l2)
				   + x3 * (x3 * x3 + y3 * y3 + z3 * z3 - l3 * l3);
		
		//second row														1
		double m10 = x0 * y0
				   + x1 * y1
				   + x2 * y2
				   + x3 * y3;
		
		double m11 = y0 * y0
				   + y1 * y1
				   + y2 * y2
				   + y3 * y3;
		
		double m12 = y0 * z0
				   + y1 * z1
				   + y2 * z2
				   + y3 * z3;
		
		double m13 = y0
				   + y1
				   + y2
				   + y3;
		
		double m14 = y0 * (x0 * x0 + y0 * y0 + z0 * z0 - l0 * l0)
				   + y1 * (x1 * x1 + y1 * y1 + z1 * z1 - l1 * l1)
				   + y2 * (x2 * x2 + y2 * y2 + z2 * z2 - l2 * l2)
				   + y3 * (x3 * x3 + y3 * y3 + z3 * z3 - l3 * l3);
		
		//third row														2
		double m20 = x0 * z0
				   + x1 * z1
				   + x2 * z2
				   + x3 * z3;
				
		double m21 = y0 * z0
				   + y1 * z1
				   + y2 * z2
				   + y3 * z3;
		
		double m22 = z0 * z0
				   + z1 * z1
				   + z2 * z2
				   + z3 * z3;
		
		double m23 = z0
				   + z1
				   + z2
				   + z3;
		
		double m24 = z0 * (x0 * x0 + y0 * y0 + z0 * z0 - l0 * l0)
				   + z1 * (x1 * x1 + y1 * y1 + z1 * z1 - l1 * l1)
				   + z2 * (x2 * x2 + y2 * y2 + z2 * z2 - l2 * l2)
				   + z3 * (x3 * x3 + y3 * y3 + z3 * z3 - l3 * l3);
		
		//fourth row														3
		double m30 = x0
				   + x1
				   + x2
				   + x3;
		
		double m31 = y0
				   + y1
				   + y2
				   + y3;
		
		double m32 = z0
				   + z1
				   + z2
				   + z3;
		
		double m33 = 4;
		
		double m34 = x0 * x0 + y0 * y0 + z0 * z0 - l0 * l0
				   + x1 * x1 + y1 * y1 + z1 * z1 - l1 * l1
				   + x2 * x2 + y2 * y2 + z2 * z2 - l2 * l2
				   + x3 * x3 + y3 * y3 + z3 * z3 - l3 * l3;

		////////////////////////////////////////////////////////// matrices for a, b, c, and d determinates(rows and columns start at 0)
		
		//top matrix for a														A
		//first row
		double ma00 = -m04;
		double ma01 =  m01;
		double ma02 =  m02;
		double ma03 =  m03;
		//second row
		double ma10 = -m14;
		double ma11 =  m11;
		double ma12 =  m12;
		double ma13 =  m13;
		//third row
		double ma20 = -m24;
		double ma21 =  m21;
		double ma22 =  m22;
		double ma23 =  m23;
		//fourth row
		double ma30 = -m34;
		double ma31 =  m31;
		double ma32 =  m32;
		double ma33 =  m33;
		
		//top matrix for b														B
		//first row
		double mb00 =  m00;
		double mb01 = -m04;
		double mb02 =  m02;
		double mb03 =  m03;
		//second row
		double mb10 =  m10;
		double mb11 = -m14;
		double mb12 =  m12;
		double mb13 =  m13;
		//third row
		double mb20 =  m20;
		double mb21 = -m24;
		double mb22 =  m22;
		double mb23 =  m23;
		//fourth row
		double mb30 =  m30;
		double mb31 = -m34;
		double mb32 =  m32;
		double mb33 =  m33;
		
		//top matrix for C														C
		//first row
		double mc00 =  m00;
		double mc01 =  m01;
		double mc02 = -m04;
		double mc03 =  m03;
		//second row
		double mc10 =  m10;
		double mc11 =  m11;
		double mc12 = -m14;
		double mc13 =  m13;
		//third row
		double mc20 =  m20;
		double mc21 =  m21;
		double mc22 = -m24;
		double mc23 =  m23;
		//fourth row
		double mc30 =  m30;
		double mc31 =  m31;
		double mc32 = -m34;
		double mc33 =  m33;
		
		//top matrix for D														D
		//first row
		double md00 =  m00;
		double md01 =  m01;
		double md02 =  m02;
		double md03 = -m04;
		//second row
		double md10 =  m10;
		double md11 =  m11;
		double md12 =  m12;
		double md13 = -m14;
		//third row
		double md20 =  m20;
		double md21 =  m21;
		double md22 =  m22;
		double md23 = -m24;
		//fourth row
		double md30 =  m30;
		double md31 =  m31;
		double md32 =  m32;
		double md33 = -m34;
						
		
		/////////////////////////////////////////////////// Determinate finders for the a, b, c, d, and base matrices (rows and colums start at 0)
		
		
		double aDeterminate = ma03 * ma12 * ma21 * ma30-ma02 * ma13 * ma21 * ma30-ma03 * ma11 * ma22 * ma30+ma01 * ma13 * ma22 * ma30+
				 			  ma02 * ma11 * ma23 * ma30-ma01 * ma12 * ma23 * ma30-ma03 * ma12 * ma20 * ma31+ma02 * ma13 * ma20 * ma31+
			      			  ma03 * ma10 * ma22 * ma31-ma00 * ma13 * ma22 * ma31-ma02 * ma10 * ma23 * ma31+ma00 * ma12 * ma23 * ma31+
			      			  ma03 * ma11 * ma20 * ma32-ma01 * ma13 * ma20 * ma32-ma03 * ma10 * ma21 * ma32+ma00 * ma13 * ma21 * ma32+
			      			  ma01 * ma10 * ma23 * ma32-ma00 * ma11 * ma23 * ma32-ma02 * ma11 * ma20 * ma33+ma01 * ma12 * ma20 * ma33+
			      			  ma02 * ma10 * ma21 * ma33-ma00 * ma12 * ma21 * ma33-ma01 * ma10 * ma22 * ma33+ma00 * ma11 * ma22 * ma33;
		
		double bDeterminate = mb03 * mb12 * mb21 * mb30-mb02 * mb13 * mb21 * mb30-mb03 * mb11 * mb22 * mb30+mb01 * mb13 * mb22 * mb30+
			      			  mb02 * mb11 * mb23 * mb30-mb01 * mb12 * mb23 * mb30-mb03 * mb12 * mb20 * mb31+mb02 * mb13 * mb20 * mb31+
			      			  mb03 * mb10 * mb22 * mb31-mb00 * mb13 * mb22 * mb31-mb02 * mb10 * mb23 * mb31+mb00 * mb12 * mb23 * mb31+
			      			  mb03 * mb11 * mb20 * mb32-mb01 * mb13 * mb20 * mb32-mb03 * mb10 * mb21 * mb32+mb00 * mb13 * mb21 * mb32+
			      			  mb01 * mb10 * mb23 * mb32-mb00 * mb11 * mb23 * mb32-mb02 * mb11 * mb20 * mb33+mb01 * mb12 * mb20 * mb33+
			      			  mb02 * mb10 * mb21 * mb33-mb00 * mb12 * mb21 * mb33-mb01 * mb10 * mb22 * mb33+mb00 * mb11 * mb22 * mb33;
		
		double cDeterminate = mc03 * mc12 * mc21 * mc30-mc02 * mc13 * mc21 * mc30-mc03 * mc11 * mc22 * mc30+mc01 * mc13 * mc22 * mc30+
				              mc02 * mc11 * mc23 * mc30-mc01 * mc12 * mc23 * mc30-mc03 * mc12 * mc20 * mc31+mc02 * mc13 * mc20 * mc31+
			                  mc03 * mc10 * mc22 * mc31-mc00 * mc13 * mc22 * mc31-mc02 * mc10 * mc23 * mc31+mc00 * mc12 * mc23 * mc31+
			                  mc03 * mc11 * mc20 * mc32-mc01 * mc13 * mc20 * mc32-mc03 * mc10 * mc21 * mc32+mc00 * mc13 * mc21 * mc32+
			                  mc01 * mc10 * mc23 * mc32-mc00 * mc11 * mc23 * mc32-mc02 * mc11 * mc20 * mc33+mc01 * mc12 * mc20 * mc33+
			                  mc02 * mc10 * mc21 * mc33-mc00 * mc12 * mc21 * mc33-mc01 * mc10 * mc22 * mc33+mc00 * mc11 * mc22 * mc33;
		
		double dDeterminate = md03 * md12 * md21 * md30-md02 * md13 * md21 * md30-md03 * md11 * md22 * md30+md01 * md13 * md22 * md30+
			                  md02 * md11 * md23 * md30-md01 * md12 * md23 * md30-md03 * md12 * md20 * md31+md02 * md13 * md20 * md31+
			                  md03 * md10 * md22 * md31-md00 * md13 * md22 * md31-md02 * md10 * md23 * md31+md00 * md12 * md23 * md31+
			                  md03 * md11 * md20 * md32-md01 * md13 * md20 * md32-md03 * md10 * md21 * md32+md00 * md13 * md21 * md32+
			                  md01 * md10 * md23 * md32-md00 * md11 * md23 * md32-md02 * md11 * md20 * md33+md01 * md12 * md20 * md33+
			                  md02 * md10 * md21 * md33-md00 * md12 * md21 * md33-md01 * md10 * md22 * md33+md00 * md11 * md22 * md33;
		
		double baseDeterminate = m03 * m12 * m21 * m30-m02 * m13 * m21 * m30-m03 * m11 * m22 * m30+m01 * m13 * m22 * m30+
                                 m02 * m11 * m23 * m30-m01 * m12 * m23 * m30-m03 * m12 * m20 * m31+m02 * m13 * m20 * m31+
                                 m03 * m10 * m22 * m31-m00 * m13 * m22 * m31-m02 * m10 * m23 * m31+m00 * m12 * m23 * m31+
                                 m03 * m11 * m20 * m32-m01 * m13 * m20 * m32-m03 * m10 * m21 * m32+m00 * m13 * m21 * m32+
                                 m01 * m10 * m23 * m32-m00 * m11 * m23 * m32-m02 * m11 * m20 * m33+m01 * m12 * m20 * m33+
                                 m02 * m10 * m21 * m33-m00 * m12 * m21 * m33-m01 * m10 * m22 * m33+m00 * m11 * m22 * m33;
		
		///////////////////////////////////////////////////// get a, b, c, and d by dividing each determinate by the base determinate
		
		double a = aDeterminate / baseDeterminate;
		double b = bDeterminate / baseDeterminate;
		double c = cDeterminate / baseDeterminate;
		double d = dDeterminate / baseDeterminate;

		///////////////////////////////////////////////////// get x, y, and z by dividing a, b, and c by -2 and return as arraylist
		
		double x = a / -2;
		double y = b / -2;
		double z = c / -2;
		double radius = Math.sqrt(Math.abs(d));
		
		double[] XYZ = {x, y, z};
		return XYZ;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		

		System.out.println(Arrays.toString(
				
				
				
				getXYZ(0, 0, 2.76, 			//anchor 0 xyz
					   0, 6, 2.76, 			//anchor 1 xyz
					   6, 6, 2.76, 			//anchor 2 xyz
					   6, 0, 1.507, 			//anchor 3 xyz
					   
					   3597/1000.0,			//anchor 0 distance
					   4513/1000.0,			//anchor 1 distance
					   5097/1000.0,			//anchor 2 distance
					   4128/1000.0			//anchor 3 distance

					   
					   
					   
					   
						) 		//anchor distances
				
				));
	}

	
}
