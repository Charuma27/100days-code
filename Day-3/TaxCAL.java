//If income is less than 1,50,000 then no tax
//If taxableincome is 1,50,001 - 300,000 then charge 10% tax
//If taxable income is 3,00,001-500,000 then charge 20% tax
//If taxable income is above 5,00,001 then charge 30% tax
import java.util.*;
public class TaxCal
{
    public static void main(String [] args)
    {
        int MIN1=150001,MAX1=300000,MIN2=300001,MAX2=500000,MIN3=500001;
        double RATE1=0.10,RATE2=0.20,RATE3=0.30;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the income:");
        int income=s.nextInt();
        
        int taxable_income=income-150000;
        double tax=0;
        
        if(taxable_income<=0){
            System.out.print("No tax");
        }    
        else if (taxable_income>=MIN1 && taxable_income<MAX1)
        {
            tax=(taxable_income-MIN1)*RATE1;
        }
        else if (taxable_income>=MIN2 && taxable_income<MAX2)
        {
            tax=(taxable_income-MIN2)*RATE2;
        }
        else
        {
            tax=(taxable_income-MIN3)*RATE3;
        }    
        System.out.println("TAX="+ tax);    
    }
}
