import javax.lang.model.util.ElementScanner14;

public class FlipEdge
{
  public static void main(String[] args)
  {
    // Math.random gibt eine zufällige Zahl zwischen 0 und 1 aus. (0 inbegriffen, 1 exklusiv)
    double a = Math.random();
    if (a < 0.499)
    { 
      System.out.println("Head");
    } 
    else 
    {
      if (a< 0.998)
      {
        System.out.println("Tails");
      }  
      else
      {
        System.out.println("Edge");
      }
    }
  }
}
