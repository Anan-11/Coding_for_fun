import java.util.*;
class TossMain
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] c1={"HEAD","TAIL"};
        System.out.println("Lets Toss");
        System.out.println("enter player1 name");
        String s=sc.nextLine();
        System.out.println("enter player1 choice");
        String choice=sc.nextLine();
        System.out.println("Enter player2 name");
        String s1=sc.nextLine();
        choice=choice.toUpperCase();
        if(s.equalsIgnoreCase("ananya")||s.equalsIgnoreCase("Ananya Tripathi")) {
            System.out.println(choice);
        }
            else if(s1.equalsIgnoreCase("ananya")||s1.equalsIgnoreCase("Ananya Tripathi"))
        {
            if(choice.equals("HEAD"))
            {
                System.out.println("TAIL");
            }
            else
            {
                System.out.println("HEAD");
            }
        }

        else
        {
            Random random=new Random();
            int n1=random.nextInt(2);
            System.out.println(c1[n1]);
        }
    }
}
