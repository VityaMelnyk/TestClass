package com.company;
class A {public int getCode(){return 2;}}
class AA extends A {public int getCode(){return 3;}}
public class TestClass {
    public int getCode(){return 1;}
    public static void main(String[] args) throws Exception{
	A a = new A();
	A aa = new AA();
        System.out.println(a.getCode()+" " + aa.getCode());
    }
}
