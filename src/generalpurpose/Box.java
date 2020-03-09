package generalpurpose;

import java.awt.HeadlessException;

public class Box {
	private double height,width,length;
	public void setVal(double h, double w, double l){
		height = h;
		width = w;
		length = l;
	}
	public double volume(){
		double volume = height * width * length;
		return volume;
	}
/*	void volume () {
		double vol = height * width * length;
		System.out.println("volume of box is: " + vol);
	}*/
/*	void volume (double h,double w, double l) {
		double vol = h * w * l;
		System.out.println("Vol of box is: " + vol);
	}*/
/*	double volume (double h, double w, double l) {
		height = h;
		width = w;
		length = l;
		double vol = height * width * length;
		return vol;
	}*/

}
