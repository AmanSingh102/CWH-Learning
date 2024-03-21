import java.util.Scanner;

public class java_21_Practise_Set_Income_Tax_Paid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income in lakh : ");
        float income = sc.nextFloat();
        float tax = 0;

        if( income < 2.5f )
            tax = tax + 0;
        else if( income > 2.5f && income <= 5F )
            tax = tax + 0.05f * ( income - 2.5f );
        else if( income > 5f && income <= 10.0f )
        {
            tax = tax + 0.05f * ( 5.0f - 2.5f );
            tax = tax + 0.2f * ( income - 5f );
        }
        else if( income > 10.0f )
        {
            tax = tax + 0.05f * ( 5.0f - 2.5f );
            tax = tax + 0.2f * ( 10.0f - 5f );
            tax = tax + 0.3f * ( income - 10.0f );
        }

        System.out.println("Total tax paid ny employ is : " + tax );

    }
}
