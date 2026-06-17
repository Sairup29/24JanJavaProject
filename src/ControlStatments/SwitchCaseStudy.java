package ControlStatments;

public class SwitchCaseStudy {

    public static void main(String[] args) {


        int month=2;

        switch (month)
        {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("enter a valid number");
               break;
        }

        System.out.println("===========================================");

          String season = "summer";

          switch(season)
          {
              case "summer":
                  System.out.println("ac");
                  break;
              case "winter":
                  System.out.println("heater");
              case "rainy":
                  System.out.println("umbrella");
          }



    }

}
