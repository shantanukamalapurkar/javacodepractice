package generic_code;

import java.sql.SQLOutput;

public class chaintest {
    int a;
    String name;
    public chaintest setavalue(){
        //int a;
        this.a=10;
       return this;
    }

    public chaintest setname(){
        this.name="shantanu";
        return this;
    }
    public String getname(){
        return this.name;
    }

}

class mainrun{
    public static void main(String args[]){
        chaintest ct = new chaintest();
        System.out.println(ct.setavalue().setname().getname());
    }
}
