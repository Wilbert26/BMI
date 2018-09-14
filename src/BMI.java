import java.util.Scanner;

public class BMI {

  public static void main(String[] args){
  //write your code here
  /*BMI=kg/M*M
   M=inch*(0.025meters/inch)
   inch=M*(inch/0.025meters)
   */
      Scanner keyboard;
      double userHeight,userweight,total,userMeter,userKilo;
      keyboard=new Scanner(System.in);

      System.out.println("enter your height in inches");
      userHeight=keyboard.nextInt();

      userMeter=(userHeight*(0.0254/1));

      System.out.println("enter your weight in pounds");
      userweight=keyboard.nextInt();

      userKilo=(.45*userweight);

      total=(userKilo/(userMeter*userMeter));

      System.out.println(total);




  }




}
