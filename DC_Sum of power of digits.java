import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numdigits = String.valueOf(n).length();
        int sum =0;
        int orign = n;
        while(orign > 0) {
            int digit = orign%10;
            int powereddigit = 1;
            for(int i=0;i<numdigits;i++) {
                powereddigit *= digit;
            }
            sum+=powereddigit;
            orign/=10;
        }
        System.out.print(sum);
    }
}