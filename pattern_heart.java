import java.util.Scanner;
public class pattern_heart {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=3;i<n+1;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n+1;j++){
                System.out.print("* ");
            }
            for(int j=i;j<n+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


