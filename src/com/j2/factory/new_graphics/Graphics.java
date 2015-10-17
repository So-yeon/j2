package com.j2.factory.new_graphics;

public abstract class Graphics{
  String name;
  Shadow shadow;
  StereoGraphy stereo;
  Fill_up fill_up;

  
  abstract void display();
  void printName() {
    System.out.println("This Graphics name is "+name + ". \n");
  }
  void whatEffect() {
    System.out.println(name + " is effecting for fill_up and shadow.... " +" \n" );
  }
  void isStereo() {
    System.out.println(name + " is effecting for StereoGraphy...."+ "\n");
  }
  void setName(String name){
    this.name = name;
  }
  String getName(){
    return name;
  }
  //String 으로 출력될 것들 고치기 
  public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(name);
        if (shadow != null) {
            result.append(shadow);
            result.append("\n");
        }
        if (stereo != null) {
            result.append(stereo);
            result.append("\n");
        }
        if (fill_up != null) {
            result.append(fill_up);
            result.append("\n");
        }
        return result.toString();
    }
}