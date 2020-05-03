package oops.inheritance.OverLoading;

public class caseFive {
    public void m1(int i){
        System.out.println("int argument");
    }
    public void m1(int... i){
        System.out.println("var argument");
    }

    public static void main(String[] args) {
        caseFive c5 = new caseFive();
        c5.m1();
        c5.m1(10);
        c5.m1(10,10);
    }
}

/* Explanation
*
* m1(int.. i) --> will get least priority
* when no other method get matched then var argument method will get chance to execute
*
* same like default statement from switch case
*
* */