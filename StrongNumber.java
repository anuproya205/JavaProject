import java.util.Scanner;

public class StrongNumber {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        int sum=0, n1=n;
        while (n!=0){
            int digit= n%10;
            sum=sum+fact(digit);
            n= n/10;
        }
        if(sum==n1) {
            System.out.println("strong number ");
        }else {
            System.out.println("not strong number ");
        }
        sc.close();
    }

}
