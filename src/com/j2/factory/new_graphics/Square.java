package com.j2.factory.new_graphics;

public class Square extends Graphics{
  GraphicsEffectFactory effectFactory;
  
  public Square(GraphicsEffectFactory effectFactory) {
    this.effectFactory = effectFactory;
  }
  
  void display(){
    System.out.println("DisPlay " + name);
    shadow = effectFactory.effectShadow();
    stereo = effectFactory.effectStereo();
    fill_up = effectFactory.effectFill_up();
  }
}