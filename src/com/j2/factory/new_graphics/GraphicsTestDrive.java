package com.j2.factory.new_graphics;

public class GraphicsTestDrive{
  public static void main (String[] args){
    GraphicsGallery circle = new CircleGallery();
    GraphicsGallery triangle = new TriangleGallery();
    GraphicsGallery square = new SquareGallery();
    
    Graphics graphics = circle.effectGraphics("circle");
    System.out.println("Soyeon want see a " + graphics + "\n");
    
    graphics = triangle.effectGraphics("triangle");
    System.out.println("Siwoo want see a " + graphics + "\n"); 
    
    graphics = square.effectGraphics("square");
    System.out.println("Sohee want see a " + graphics + "\n"); 
  }
}