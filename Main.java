class Main {
  public static void main(String[] args) {
    int total = 495;
    double blue =total * .24;
    double brown =total * .13;
    double green =total * .16;
    double red = total * .13;
    double orange = total * .2;
    double yellow = total * .14;


    System.out.println("M&M Color Counts");
    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("red: " + red);
    System.out.println("orange: " + orange);
    System.out.println("yellow: " + yellow);

    double sum = blue+brown+green+red+orange+yellow;
    int intSum = (int) sum;
    System.out.println("Sum of M&M's" + sum);
    System.out.println("Rounded Sum of M&M's" + intSum);

    if ( blue > brown && green > red) {
      System.out.println("Blue over Brown and Green over Red");
    } 
    if ( brown <= orange) {
      System.out.println("Brown is less than or equal to Orange");
    } 
    if (sum == total){
      System.out.println("Numbers match without rounding");
    }
    if (intSum == total){
      System.out.println("Numbers match when rounded");
    }
  }
}