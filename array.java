public class array {
    public static void main(String[] args) {
        int arr[]=new int[3];
        Class c=arr.getClass();
        String str=c.getName();
        System.out.println(str);
        //int arr[]={1,2,3,4,5,6};
        //arr[0]=100;
        //arr[1]=200;
        //arr[2]=300;
        for(int j:arr)
        {
            System.out.println(j);
        }
    }
}
