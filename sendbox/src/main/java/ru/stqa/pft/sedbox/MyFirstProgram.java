package ru.stqa.pft.sedbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Natalia");

    Square s = new Square(5);

    System.out.println("Square area with each side "+ s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);

    System.out.println("Rectangle area with sides " + r.a + "and " + r.b + " =" + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }




  }


  