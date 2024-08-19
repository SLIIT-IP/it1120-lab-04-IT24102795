import java.util.scanner;
public  class IT24102795Lab4Q1 {
    public static void main(String[] args) {

        scanner input = new Scanner(System.in);
        double num;

        System.out.print("Enter a number : ");
        num = input.nextDouble();

        if (num > 0)
        {
            System.out.prit("The number is : Positive");
        }

        else if (num < 0)
        {
            System.out.print("The  number is : Negative");
        }

        else
        {
            System.out.print("The number is Zero");
        }
    }
}