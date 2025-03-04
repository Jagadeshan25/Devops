import java.util.*;
public class sum
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        
        for(int i=a;i<=b; i++){
            sum=sum+i; /*or sum+=i*/
            
         }
         System.out.print(sum);
    }
    }
