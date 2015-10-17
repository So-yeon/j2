package com.j2.factory.new_graphics;

public abstract class GraphicsGallery{
  protected abstract Graphics showGraphics(String item);
  
  public Graphics effectGraphics(String type) {
    Graphics graphics = showGraphics(type);
    System.out.println("***** Showing a " + graphics.getName() + " *****");
    graphics.printName();
    graphics.whatEffect();
    graphics.isStereo();
    return graphics;
  }
}