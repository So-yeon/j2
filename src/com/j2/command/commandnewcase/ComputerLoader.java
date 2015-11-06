package com.j2.command.commandnewcase;

public class ComputerLoader {
  public static void main(String[] args) {
    ComputerControl computerControl = new ComputerControl();

    KakaoTalk kakaoTalk = new KakaoTalk("Soyeon Computer ");
    InternetExplore internetExplore = new InternetExplore("Soyeon Computer");
    MelonMusicPlayer melonMusicPlayer = new MelonMusicPlayer("Soyeon Computer ");
 
    KakaoTalkOnCommand kakaoTalkOn = new KakaoTalkOnCommand(kakaoTalk);
    InternetExploreOnCommand internetExploreOn = new InternetExploreOnCommand(internetExplore);
    MelonMusicPlayerOnCommand melonMusicPlayerOn = new MelonMusicPlayerOnCommand(melonMusicPlayer);
    
    KakaoTalkOffCommand kakaoTalkOff = new KakaoTalkOffCommand(kakaoTalk);
    InternetExploreOffCommand internetExploreOff = new InternetExploreOffCommand(internetExplore);
    MelonMusicPlayerOffCommand melonMusicPlayerOff = new MelonMusicPlayerOffCommand(melonMusicPlayer);
    
    Command[] partyOn = { kakaoTalkOn, internetExploreOn, melonMusicPlayerOn};
    Command[] partyOff = { kakaoTalkOff, internetExploreOff, melonMusicPlayerOff};
///////////////////////////////////////////////////////////////////  
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
    computerControl.setCommand(0, partyOnMacro, partyOffMacro);
  
    System.out.println(computerControl);
    System.out.println("-_-_-_-_- Welcome to Soyeon Computer -_-_-_-_-");
    System.out.println("*** Pushing Computer On***");
    computerControl.onButtonWasPushed(0);
    System.out.println("\n");
    System.out.println("*** Pushing Computer Off***");
    computerControl.offButtonWasPushed(0);
  }
}
