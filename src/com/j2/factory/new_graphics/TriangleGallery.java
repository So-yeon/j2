package com.j2.factory.new_graphics;

public class TriangleGallery extends GraphicsGallery {
    protected Graphics showGraphics(String item) {
        Graphics graphics = null;
        GraphicsEffectFactory effectFactory=new TriangleEffectFactory();
        if (item.equals("triangle")) {
            graphics = new Triangle(effectFactory);
            graphics.setName("Weak 4D Pink Style Triangle");
          }
        return graphics;
    }
}

