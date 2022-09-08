public class annarr2 {
    //with return
    int[] display()
    {
        return new int[] {1,2,3,4};
    }
    public static void main(String[] args) {
        annarr2 a=new annarr2();
        int d[]=a.display();
        for(int i:d){
            System.out.println(i);
        }
    }
}