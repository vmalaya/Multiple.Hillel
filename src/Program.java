import java.util.Scanner;

/**
 * Created by Валентина on 20.05.2017.
 */
public class Program {
    public static  void  main (String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number");
        int number = scanner.nextInt();
        Multiple(number);
    }
    static public void Multiple(int number){
        for (int i = 1; i<= number; i++){
            if(number%i == 0){
               System.out.printf(" The number %d is a multiple of number %d \n", number, i);
            }
        }
    }
}

