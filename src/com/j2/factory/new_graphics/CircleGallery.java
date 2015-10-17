package com.j2.factory.new_graphics;

public class CircleGallery extends GraphicsGallery {
    protected Graphics showGraphics(String item) {
        Graphics graphics = null;
        GraphicsEffectFactory effectFactory=new CircleEffectFactory();
        if (item.equals("circle")) {
            graphics = new Circle(effectFactory);
            graphics.setName("Strong 3D Red Style Circle");
          }
        return graphics;
    }
}
