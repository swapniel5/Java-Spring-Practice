package oops.inheritance.OverLoading;

public class caseTwo {
    public void m1(String s){
        System.out.println("string argument");
    }
    public void m1(Object o){
        System.out.println("object argument");
    }

    public static void main(String[] args) {

        caseTwo caseTwo = new caseTwo();
        caseTwo.m1("Swapnil");      // string argument
        caseTwo.m1(new Object());       // object argument
        caseTwo.m1(null);           // string argument
    }
}
/*Explanation
*
* while resolving oversloaded methods, compiler will gives precedence for child type argument
* than compared with parent type argument
*       Object  (Parent)
*       |
*       |
*       String (Child)
* */