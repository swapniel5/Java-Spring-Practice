package oops.inheritance.OverLoading;

public class caseThree {
    public void m1(String s){
        System.out.println("String argument");
    }
    public void m1(StringBuffer sb){
        System.out.println("StringBuffer argument");
    }

    public static void main(String[] args) {
        caseThree c3 = new caseThree();
        c3.m1("swapnil");
        c3.m1(new StringBuffer("sWapnil"));
        //c3.m1(null);      compile time error  reference to m1 is ambiguous
    }
}

/*      Explanation
*           Object
*             |
*       -------------
*       |           |
*     String    StringBuffer
*
* Same level classes creates ambiguity
* */