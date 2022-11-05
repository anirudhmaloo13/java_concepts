package com.brillio.datatypes;

import Area.Area;

public class DemoMethod {
	
	

	public static void main(String[] args) {
		
		Area obj= new Area();
		
		double b= obj.areaofcircle(10);
		System.out.println(b);
		
		double a= obj.areaofrectangle(10.2, 6.5);
		System.out.println(a);
		
		Area.getTitle();
	}
}
