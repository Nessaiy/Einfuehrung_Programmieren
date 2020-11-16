public class Flip
{
  public static void main(String[] args)
  {
    // Math.random gibt eine zufällige Zahl zwischen 0 und 1 aus. (0 inbegriffen, 1 exklusiv)
    if (Math.random() < 0.5) System.out.println("Kopf");
    else                    System.out.println("Zahl");
    
  }
}
