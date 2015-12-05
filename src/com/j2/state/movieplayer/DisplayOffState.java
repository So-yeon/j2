package com.j2.state.movieplayer;

public class DisplayOffState implements State{
  MoviePlayer moviePlayer;
  
  public DisplayOffState(MoviePlayer moviePlayer){
    this.moviePlayer = moviePlayer;
  }
  public void stopMovie(){
    System.out.println("Stop movie playing.");
    moviePlayer.setState(moviePlayer.getEndMovieState());
  }
  public void sleepMode(){
    moviePlayer.isSleepMode();
    System.out.println("Convert to Display sleep mode.");
  }
  public void noSleep(){
    System.out.println("Don't convert Display sleep mode.");
  }
  public String toString() {
    return "Diplay is off.";
  }
}