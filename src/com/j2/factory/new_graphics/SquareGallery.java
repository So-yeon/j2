package com.j2.factory.new_graphics;

public class SquareGallery extends GraphicsGallery {
    protected Graphics showGraphics(String item) {
        Graphics graphics = null;
        GraphicsEffectFactory effectFactory=new SquareEffectFactory();
        if (item.equals("square")) {
            graphics = new Square(effectFactory);
            graphics.setName("Weak 3D Pink Style Square");
          }
        return graphics;
    }
}
