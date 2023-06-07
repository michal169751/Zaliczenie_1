import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj wartość a: ");
    double a = scan.nextDouble();
    System.out.println("Podaj wartość b: ");
    double b = scan.nextDouble();
    System.out.println("Podaj wartość c: ");
    double c = scan.nextDouble();
    scan.close();
    if (a != 0 && b != 0 && c != 0) {
    System.out.println("Twoje równanie: "+a+"*x^2 + "+b+"*x + " + c); }
    if (a != 0 && b == 0 && c != 0) {
      System.out.println("Twoje równanie: "+a+"*x^2 + " + c);
    }
    if (a != 0 && b != 0 && c == 0) {
      System.out.println("Twoje równanie: "+a+"*x^2 + "+b+"*x");
    }
    if (a != 0 && b == 0 && c == 0) {
    System.out.println("Twoje równanie: "+a+"*x^2");
    }
    double delta = 0;
    double x = 0;
    double x1 = 0;
    double x2 = 0;
    double p_delta = 0;
    delta = (b*b) - (4*a*c);
    p_delta = Math.sqrt(delta);
    if (a == 0) {
      System.out.println("To nie jest równanie kwadratowe!"); }
    else {
      if (delta < 0) {
        System.out.println("Brak rozwiązań rzeczywistych");
      }
      if (delta == 0) {
        x = (-b/a);
        System.out.println("Pierwiastkiem tego równania jest: " + x);
      }
      if (delta > 0) {
        x1 = (-b + p_delta)/(2*a);
        x2 = (-b - p_delta)/(2*a);
        System.out.println("Pierwszy pierwiastek równania: " + x1 + "\nDrugi pierwiastek równania: " + x2);
      }
    }
  }
}