package net.majorkernelpanic;

public class AngleHandler {
   public static String Angle = "000000";
   static int xAngle;
   static int yAngle;

   AngleHandler() {
      String x = Angle.substring(0, 2);
      int xAngle = Integer.parseInt(x);
      String y = Angle.substring(3, 5);
      int yAngle = Integer.parseInt(y);
      Angle = this.Angle;
   }

   public static void upAngle() {
      yAngle = yAngle + 30;
      if (yAngle > 180) {
         yAngle = 180;
      }
   }

   public static void downAngle() {
      yAngle = yAngle - 30;
      if (yAngle < 0) {
         yAngle = 0;
      }
   }

   public static void leftAngle() {
      xAngle = xAngle - 30;
      if (xAngle < 0) {
         xAngle = 0;
      }
   }

   public static void rightAngle() {
      xAngle = xAngle + 30;
      if (xAngle > 180) {
         xAngle = 180;
      }
   }

   public static String setAngle() {
      String xStringAngle = String.valueOf(xAngle);
      String yStringAngle = String.valueOf(yAngle);
      if (xStringAngle.length() < 3) {
         if (xStringAngle.length() == 1) {
            xStringAngle = "00" + xStringAngle;
         } else {
            xStringAngle = "0" + xStringAngle;
         }
      }
      if (yStringAngle.length() < 3) {
         if (yStringAngle.length() == 1) {
            yStringAngle = "00" + yStringAngle;
         } else {
            yStringAngle = "0" + yStringAngle;
         }
      }
      Angle = xStringAngle + yStringAngle;
      return Angle;
   }
}