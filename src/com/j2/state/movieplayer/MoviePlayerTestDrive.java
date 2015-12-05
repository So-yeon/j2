package com.j2.state.movieplayer;

public class MoviePlayerTestDrive{
  public static void main (String args[]){
    MoviePlayer moviePlayer = new MoviePlayer(1);
    
    System.out.println(moviePlayer);
    
    moviePlayer.noSleep();
    System.out.println(moviePlayer);
    
    moviePlayer.stopMovie();
    moviePlayer.sleepMode();
    System.out.println(moviePlayer);
  }
}