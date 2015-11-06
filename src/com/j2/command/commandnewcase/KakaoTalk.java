package com.j2.command.commandnewcase;

public class KakaoTalk {
  String path;
  boolean newMessage;
  
  public KakaoTalk(String path) {
    this.path = path;
  }
  
  public void on() {
    System.out.println("* " + path + "KakaoTalk is on");
    System.out.println("[Checking new message!]");
  }
  
  public void off() {
    System.out.println(path + "KakaoTalk is off");
  }
  
   public void getMessage(boolean newMessage) {
   if (newMessage == true) {
     System.out.println("You've got new message!");}
   else {
     System.out.println("Sorry, no message in kakao..");
   }
   this.newMessage = newMessage;
 }
}