package oops.inheritance.OverLoading;

public class caseOne {
    public void m1(int i){
        System.out.println("integer argument");
    }
    public void m1(float i){
        System.out.println("Float argument");
    }

    public static void main(String[] args) {
        caseOne c = new caseOne();
        c.m1(10);           // integer argument
        c.m1(10.5f);        // float argument
        c.m1('a');          // integer argument
        c.m1(10l);          // flaot argument
        //c.m1(10.5);         // compiletime no suitable method for m1(double)
    }

}
