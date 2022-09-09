package oops;
class a{
    void Move(){
        System.out.println("hello");
    }
}
class b extends a{
    void show(){
        System.out.println("hii");
    }
}
class c extends b{
    void shows(){
        System.out.println("how are you");
    }
}
public class inheritance {
    public static void main(String[] args) {
        b f=new b();
        a g=new a();
        c q=new c();
        f.show();
        g.Move();   
        q.shows();     
    }
}
