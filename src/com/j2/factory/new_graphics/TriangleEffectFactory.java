package com.j2.factory.new_graphics;

public class TriangleEffectFactory implements GraphicsEffectFactory{
    public Shadow effectShadow() {
        return new WeakShadow();
    }
    public StereoGraphy effectStereo() {
        return new Stereo4D();
    }
    public Fill_up effectFill_up() {
        return new Fill_up_Pink();
    }
}