package com.j2.command.commandnewcase;

public class KakaoTalkOffCommand implements Command {
 KakaoTalk kakaoTalk;
 boolean newMessage;
 
 public KakaoTalkOffCommand(KakaoTalk kakaoTalk) {
  this.kakaoTalk = kakaoTalk;
 }
 
 public void execute() {
  kakaoTalk.getMessage(false);
  kakaoTalk.off();
 }
 
 public void undo() {
  kakaoTalk.on();
 }
}