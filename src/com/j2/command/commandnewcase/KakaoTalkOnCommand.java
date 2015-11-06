package com.j2.command.commandnewcase;

public class KakaoTalkOnCommand implements Command {
 KakaoTalk kakaoTalk;
 boolean newMessage;
 
 public KakaoTalkOnCommand(KakaoTalk kakaoTalk) {
  this.kakaoTalk = kakaoTalk;
 }
 
 public void execute() {
  kakaoTalk.on();
  kakaoTalk.getMessage(true);
 }
 
 public void undo() {
  kakaoTalk.off();
 }
}