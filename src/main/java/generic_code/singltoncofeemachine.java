package generic_code;

public class singltoncofeemachine {
    private int coffee;
    private int water;
    private int milk;
    public static singltoncofeemachine machineinstance=null;

    private singltoncofeemachine(){
      coffee=1;
      water=1;
      milk=1;
    }
     static public singltoncofeemachine getInstance(){
        if(machineinstance==null){
            machineinstance = new singltoncofeemachine();
            System.out.println("Machine instance created");
        }
        else {
            System.out.println("Can't create more than one instance");
        }
        return machineinstance;
    }

    public static void main (String args[]){
       singltoncofeemachine single =  singltoncofeemachine.getInstance();
        singltoncofeemachine single1 =  singltoncofeemachine.getInstance();
        singltoncofeemachine single2 =  singltoncofeemachine.getInstance();
    }
}
