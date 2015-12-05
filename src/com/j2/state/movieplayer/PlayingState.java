package com.j2.state.movieplayer;

public class PlayingState implements  State{
  MoviePlayer moviePlayer;
  
  public PlayingState(MoviePlayer moviePlayer){
    this.moviePlayer = moviePlayer;
  }
  public void stopMovie(){
    System.out.println("Stop movie playing.");
    moviePlayer.setState(moviePlayer.getDisplayOffState());
  }
  public void sleepMode(){
    moviePlayer.isSleepMode();
    System.out.println("Convert to Display sleep mode.");
  }
  public void noSleep(){
    System.out.println("Don't convert Display sleep mode.");
  }
  public String toString() {
    return "Movie is playing.";
  }
}