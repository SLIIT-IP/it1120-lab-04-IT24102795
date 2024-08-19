import java.util.scanner;
public  class IT24102795Lab4Q3 {
    public static void main(String[] args) {

        scanner input = new Scanner(System.in);

        int number;
        string result;

        System.out.print("Enter a number : ");
        number = input.nextInt();


        result = (number > 0)?
        "The number is positive" :
        (number < 0)?
        "The number  is Negative" :
        "The number is zero";

        System.out.print(result);
    }
}
