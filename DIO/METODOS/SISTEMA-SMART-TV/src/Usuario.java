import java.util.Scanner;

public class Usuario {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    SmartTv smarTv = new SmartTv();
    int option = 0;
    int exit = 1;
    int volume = 0;
    int channel = 0;
    while (exit != 0) {
      System.out.println("");        
      System.out.println("");
      System.out.println("");        
      System.out.println("Power: " + (smarTv.power ? "On" : "Off"));
      if (smarTv.power) {
        smarTv.tvOn();
      }
      else{
        smarTv.tvOff();
      }
      System.out.println("Choose an option: ");
      option = keyboard.nextInt();
      switch (option) {
        case 0:
          exit = 0;
          break;
        case 1:
          if (smarTv.power) {
            smarTv.turnOff();
          } else {
            smarTv.turnOn();
          }    
          break;
        case 2:
          smarTv.chooseChannel();
          channel = keyboard.nextInt();
          if (channel==9) {
            smarTv.i = smarTv.j;
          } else if (channel==0) {
            break;
          } else {
            if (channel>9 || channel<0 ) {
              System.out.println("Invalid option");
              break;
            }
            smarTv.j = smarTv.i;
            smarTv.i = channel-1;
          }
          break;
        case 3:
          smarTv.chooseVolumeOptions();
          volume = keyboard.nextInt();
          if (volume==1) {
            smarTv.increaseVolume();
          } else if (volume==2) {
            smarTv.decreaseVolume();
          } else if (volume==3) {
            smarTv.chooseVolumeValue();
            smarTv.volume = keyboard.nextInt();
            if (smarTv.volume>100 || smarTv.volume<0) {
              System.out.println("Invalid option");
              smarTv.volume = 25;
              break;
            }
          } else if (volume==0) {
            break;
          } else {
            System.out.println("Invalid option");
          }
          break;
        default:
          break;
      
      }
   }
  }
}
