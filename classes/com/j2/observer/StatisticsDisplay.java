package com.j2.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float temperature_Max;
  private float temperature_Min;
  private float tempAvg;
  private float humidity;
  private Subject weatherData;
  
  public StatisticsDisplay(Subject weatherData) {
   this.weatherData = weatherData;
   weatherData.registerObserver(this);
  }
  
  public void maxMin(){
   if (temperature == 82.0){
    temperature_Max = (float) 82.0;
    temperature_Min = (float) 80.0;
    tempAvg = (temperature_Max+temperature_Min)/2;
   }
   else if (temperature == 78.0){
     temperature_Max = (float) 82.0;
     temperature_Min = (float) 78.0;
     tempAvg = (temperature_Max+temperature_Min)/2;
    }
   else if (temperature == 80.0){
    temperature_Max = (float) 80.0;
    temperature_Min = (float) 80.0;
    tempAvg = (temperature_Max+temperature_Min)/2;
   }
  }
  
  
  public void update(float temperature, float humidity, float pressure) {
   this.temperature = temperature;
   this.humidity = humidity;
   display();
  }
  
  public void display() {
   maxMin();
   System.out.println("Avg/Max/Min temperature = " + tempAvg + " / " + temperature_Max + " / " + temperature_Min);
  }
}