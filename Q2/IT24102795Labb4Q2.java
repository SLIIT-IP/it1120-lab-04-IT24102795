import java.util.scanner;
public  class IT24102795Lab4Q3 {
    public static void main(String[] args) {

        scanner input = new Scanner(System.in);
        
        floot exMarks,labSub,markPre,labPre,finMark,totPress;

        System.out.print("Enter your exam marks : ");
        exMarks = input.nextFloat();

        if (exmark > 100 || exMark < 0)
        {
            System.out.print("Invaid Input for exam marks. Terminating program..");

            return
        }
        System.out.print("Please enter the lab submission marks (out of 100) :");
        labSub = input.nextFloat();

        if (labSub > 100 || labSub <0)
        {
            System.out.print("Invaid Input for exam  marks. Terminating program..");
            return;
        }

        System.out.print("Please enter the percentage given for the exam : ");

        markPre = input.nextFloat();

        System.out.print("Please enter the percentage given for the exam : ");

        labPre = input.nextFloat();

        if (markPre > 100 || markPre < 0)
        {
            System.out.print("The precentage must add ip to 100. Terminating the program..");
            return;
        }

        if (labbPre > 100 || labPre < 0)
        {
            System.out.print("The precentage must add ip to 100. Terminating the program..");

            return;
        }

        topPres = markPre + labPre;

        if (totPres > 100 || totPres < 0)
        {
            System.out.print("The precentage must add ip to 100. Terminating the program..");
            return;
        }

        finMark = (exMarks * markPre / 100) + (labSub * labPre / 100);

        System.out.print("Final exam mark is : " + finMark);
    }
}