package oops.inheritance;

class parent{
    public void m1(){
        System.out.println("Parent");
    }
}

class child extends parent{
    public void m2(){
        System.out.println("Child");
    }
}
public class testOne {
    public static void main(String[] args) {

        //case 1
        parent p = new parent();
        p.m1();
        //p.m2();     // child specific methods are not allowed for parent

        //case 2
        child c = new child();
        c.m1();
        c.m2();

        //case 3
        parent p1 = new child();
        p1.m1();        // parent reference is used for child object is valid
        //p1.m2();        // but wit that reference we cannot call child methods only call parent specific methods

        //case 4
        //child c1 = new parent();          // incampatible typess

    }


}
