public class TenHellos
{
    public static void main(String[] args)
    {
        int h = 100; //Bis wieviel soll gezählt werden
        int i = 1; //Startet bei 1
        while (i<=h)
        {
            // Print the i-th Hellos
            if (i%10 ==1 )
            {
                System.out.println(i + "st Hello");
            } else if (i%10 == 2)
            {
                System.out.println(i + "nd Hello");
            } else if (i%10 == 3)
            {
                System.out.println(i + "rd Hello");
            } else
            {
                System.out.println(i + "th Hello");
            }   
            i++;
        }
    }
}