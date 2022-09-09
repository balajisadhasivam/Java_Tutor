package oops;
public class staticblock {
    static{
        System.out.println("Welcome");
    }
    void show(){
        System.out.println("Studnts");
    }
    public static void main(String[] args) {
        staticblock t=new staticblock();
        t.show();
    }
}
