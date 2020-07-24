package javaBasic.swapValue;

public class Solution {
    public static void main(String[] args) {
        A obj1 = new A(2,3);
        A obj2 = new A(2,3);
        System.out.println(obj1.equals(obj2));
    }

    public static void swap(int a, int b){
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void swap2(int a, int b){
        a = a^b;
        b = b^a; // b^a^b = a
        a = b^a; // a^a^b = b
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

}

class A{
    private int a,b;

    public int getA() {
        return a;
    }

    A(int x,int y){
        this.a = x;
        this.b = y;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
