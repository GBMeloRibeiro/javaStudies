public class SmartTv {
  int i = 0;
  int j = 0;
  boolean power = false;
  String channel[] = {"Tv Cultura","Band", "SBT", "Globo", "Record", "RedeTV"};
  int volume = 25;

  public void tvOn() {
    System.out.println("Channel: " + channel[i]);
    System.out.println("Volume: " + volume);  
    System.out.println("========================");
    System.out.println("=========  TV  =========");
    System.out.println("========================");
    System.out.println("[1] Turn Off");
    System.out.println("[2] Change Channel");
    System.out.println("[3] Change Volume");
    System.out.println("[0] Exit");
  }

  public void tvOff() {
    System.out.println("========================");
    System.out.println("=========  TV  =========");
    System.out.println("========================");
    System.out.println("[1] Turn On");
    System.out.println("[0] Exit");
  }
   
  public void turnOn() {
    power = true;
  }
  public void turnOff() {
    power = false;
  }
  public void chooseVolumeOptions() {
    System.out.println("");        
    System.out.println("Increase or Decrease Volume? ");
    System.out.println("[1] Increase");
    System.out.println("[2] Decrease");
    System.out.println("[3] Insert a value");
    System.out.println("[0] Exit");
    System.out.println("");        
    System.out.println("Choose an option: ");
  }
  public void increaseVolume() {
    volume++;
  }
  public void decreaseVolume() {
    volume--;
  }
  public void chooseVolumeValue() {
    System.out.println("");        
    System.out.println("Insert a value:     ( 0 - 100 )");
  }
  public void chooseChannel() {
    System.out.println("");        
    System.out.println("Choose a channel: ");
    System.out.println("[1] Tv Cultura");
    System.out.println("[2] Band");
    System.out.println("[3] SBT");
    System.out.println("[4] Globo");
    System.out.println("[5] Record");
    System.out.println("[6] RedeTV");
    System.out.println("[9] Return to Last Channel");
    System.out.println("[0] Exit");
    System.out.println("");        
    System.out.println("Choose an option: ");
  }
}
