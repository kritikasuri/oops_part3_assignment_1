package com.acadgild.assignment.inheritance;

public class triangle extends dimensions {
   double area;
   
   public void area_tri(){
	   
	   area = (height * base)/2;
	   System.out.println("The area of the triangle is :"+area);
   }
}
