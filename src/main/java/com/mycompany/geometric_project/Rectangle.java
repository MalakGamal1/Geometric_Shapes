package com.mycompany.geometric_project;
public class Rectangle extends Square{
   private double width ;
    private double hight ;
    public Rectangle (){};

    public void setHeight(double hight) {
        this.hight = hight;
    }   
    @Override
    public double getPerimeter()
    {
    return 2*(hight+width);} 
    @Override
    public double getArea(){
    return hight*width;} 

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    
}
