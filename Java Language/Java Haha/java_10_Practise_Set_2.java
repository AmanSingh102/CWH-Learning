import java.util.Scanner;

public class java_10_Practise_Set_2
{
    public static void main(String[] args)
    {
            System.out.println("----------------------------------------------- ");
            System.out.println("Question 1");
            float a = 7/4f * 9/2f;
            System.out.println(a);


            System.out.println("----------------------------------------------- ");
            System.out.println("Question 2");
            // Encrypt a grade
            char grade = 'B';
            grade = (char)(grade + 8);
            System.out.println(grade);

            // decrypt a grade
            grade = (char)(grade - 8);
            System.out.println(grade);

            System.out.println("----------------------------------------------- ");
            System.out.println("Question 3");
            // Using Comparison find Greatest number
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int x = sc.nextInt();
            System.out.println(x>8);    // its return true or false0

            System.out.println("----------------------------------------------- ");
            System.out.println("Question 4");
            // Expression
            System.out.print("Enter initial velocity : ");
            int u = sc.nextInt();
            System.out.print("Enter final velocity : ");
            int v = sc.nextInt();
            System.out.print("Enter acceleration : ");
            int ac = sc.nextInt();
            System.out.print("Enter distance : ");
            int s = sc.nextInt();

            int time = ( v*v - u*u )/( 2*ac*s );
            System.out.printf("Time = %d\n",time);

            System.out.println("----------------------------------------------- ");
            System.out.println("Question 5");
            int z = 7;
            int m = z * 49/7 + 35/7;
            System.out.println(m);

        sc.close();
    }
}
