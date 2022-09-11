import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=1;i<=10;i++){
            arr[i] = s.nextInt();
        }
        for(int i=1;i<=10;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
            else if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        }
    }

