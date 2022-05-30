package generic_code;

public class staticplay {
    public static int a=10;
    int y=30;

    public void display(){
        System.out.println(a + y);
    }

    public static void show(){
        System.out.println(a );
    }

    public static void main(String args[]){
        a=20;
        staticplay s = new staticplay();
        s.display();
        staticplay.show();
    }
}
