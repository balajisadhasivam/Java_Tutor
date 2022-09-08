public class annarr {
    //without return
    void display(int a[])
    {
        for(int i:a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        annarr a=new annarr();
        a.display(new int[] {1,2,3,4});
    }
}
