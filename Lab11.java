import java.util.Scanner;
class Lab11
{
  public static String[][] capitals = {
    {"Nevada","Carson City"},
    {"Alaska","Juneau"},
    {"Arizona","Phoenix"}
  };
  public static void a()
  {
    int i = 0;
    int right = 0;
    int wrong = 0;
		Scanner in = new Scanner(System.in);
    for(i=0;i<capitals.length;i++)
    {
      String state = capitals[i][0];
      String capital = capitals[i][1];
      String[] pair = capitals[i]; 
      state = pair[0];
      capital = pair[1];

			System.out.print("What is the state capital of "+state+"?");
			String guess = in.nextLine().toLowerCase();

      if(guess.equals(capital.toLowerCase()))
      {
        right += 1;
        System.out.println("Correct Guess");
      }
      else
      {
        wrong += 1;
        System.out.println("The capital of "+state+" is "+capital+".");
      }
    }
    System.out.println("You got "+right+" right.");
    System.out.println("You got "+wrong+" right.");
  }
	public static void main(String[] args) 
	{
    a();
   }
}
/*===============================================================
What is the state capital of Nevada?CarsonCity
The capital of Nevada is Carson City.
What is the state capital of Alaska?Howell
The capital of Alaska is Juneau.
What is the state capital of Arizona?Phoenix
Correct Guess
You got 1 right.
You got 2 right.*/
