public class array2 {
    void display(int a[])
    {
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        array2 arr=new array2();
        arr.display(a);
    }
}
