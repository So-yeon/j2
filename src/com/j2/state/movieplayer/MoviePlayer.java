package com.j2.state.movieplayer;

public class MoviePlayer {
  State playingState;
  State endMovieState;
  State displayOffState;
  
  State state = endMovieState;
  int display = 0;
  
  public MoviePlayer(int displayOnOff){
    playingState = new PlayingState(this);
    endMovieState = new EndMovieState(this);
    displayOffState = new DisplayOffState(this);
    
    this.display = displayOnOff;
    if (displayOnOff == 0){
      state = endMovieState;
    }
    else
      state = playingState;
  }
  
  public void stopMovie(){
    state.stopMovie();
  }
  public void sleepMode(){
    state.sleepMode();
  }
  public void noSleep(){
    state.noSleep();
  }
  void setState(State state){
    this.state = state;
  }
  
  void isSleepMode() {
    System.out.println("Display is Sleep Mode...");
    if (display != 0) {
      display = display -1;
    }
  }
  int getDisplay() {
    return display;
  }
  
  public State getPlayingState() {
    return playingState;
  }
  
  public State getEndMovieState() {
    return endMovieState;
  }
  
  public State getDisplayOffState() {
    return displayOffState;
  }
  
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\n# New SY Movie Player #");
    result.append("\n*** Player Model number #814 ***");
    result.append("\nDisplay : " + display + " ok");
 
    result.append("\n");
    result.append("State :  " + state + "\n");
    return result.toString();
  }
}
   