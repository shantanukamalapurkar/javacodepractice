package generic_code;

public interface test {
    void meth1();
    void meth2();
}

class demo implements test{
    public void meth1(){
        System.out.println("In the test class");
    }
    public void meth2(){
        System.out.println("In meth2 of test class");

    }
    public static void main(String args[]){
        demo demo = new demo();
        demo.meth1();
        demo.meth2();
    }
}
