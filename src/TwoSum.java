import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int sum=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i]+A[j]==sum)
                    System.out.println(A[i]+" "+A[j]);
            }
        }

    }
}
