package lab;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest
{
  public static void main(String[] args)
  {
      Dog doge = new Labrador("Bubble", "green");
      Dog doge1 = new Yorkshire("John");
      System.out.println(doge.getName() + " says " + doge.speak());
      System.out.println(doge1.getName() + " says " + doge1.speak());
      System.out.println(doge.avgBreedWeight());
      System.out.println(doge1.avgBreedWeight());
  }
}