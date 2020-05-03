package oops.inheritance.OverLoading;

public class caseFour {
    public void m1(int i, float f){
        System.out.println("int float argument");
    }
    public void m1(float f, int i){
        System.out.println("float int argument");
    }

    public static void main(String[] args) {
        caseFour c4 = new caseFour();
        c4.m1(10,10.5f);
        c4.m1(10.5f,10);

        //c4.m1(10,10);           // compile time error reference to m1 is ambiguos

        //c4.m1(10.5f,10.5f);//      compile time error  no suitable method found
    }
}



/*      Explanation
*
* c4.m1(10,10);     --> compiler try to promote int to float and get ambiguity
*
* */