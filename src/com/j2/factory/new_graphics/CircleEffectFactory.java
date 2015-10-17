package com.j2.factory.new_graphics;

public class CircleEffectFactory implements GraphicsEffectFactory{
    public Shadow effectShadow() {
        return new StrongShadow();
    }
    public StereoGraphy effectStereo() {
        return new Stereo3D();
    }
    public Fill_up effectFill_up() {
        return new Fill_up_Red();
    }
}