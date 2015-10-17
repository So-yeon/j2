package com.j2.factory.new_graphics;

public class Circle extends Graphics{
  GraphicsEffectFactory effectFactory;
  
  public Circle(GraphicsEffectFactory effectFactory) {
    this.effectFactory = effectFactory;
  }
  
  void display(){
    System.out.println("DisPlay " + name);
    shadow = effectFactory.effectShadow();
    stereo = effectFactory.effectStereo();
    fill_up = effectFactory.effectFill_up();
  }
}