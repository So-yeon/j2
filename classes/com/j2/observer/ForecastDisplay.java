package com.j2.observer;

public class ForecastDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public ForecastDisplay(Subject weatherData) {
   this.weatherData = weatherData;
   weatherData.registerObserver(this);
  }
  
  public void ForecastAdvice() {
   if (temperature == 80.0)
    System.out.println("ForecastAdvice : " + "Improving weather on the way!" + "\n");
   else if (temperature == 82.0)
    System.out.println("ForecastAdvice : " + "Watch out for cooler, rainy weather" + "\n");
   else 
    System.out.println("ForecastAdvice : " + "More of the same" + "\n");
 }
  
  public void update(float temperature, float humidity, float pressure) {
   this.temperature = temperature;
   this.humidity = humidity;
   display();
  }
  
  public void display() {
    ForecastAdvice();
  }
}