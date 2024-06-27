/*
INTERFACE

interface is a collection of abstract methods 
interface is incomplete
we cannot create objects
use keyword interface
by default all variables in interface are ---> public, static, final
by default all methods in interface are ---> public, abstract
used to develop project logic or design template
to define the body of the abstract methods in the class  ---> keyword implements
one class can implement many interfaces
multiple inheritance is possible with interface
constructors --> 


----------------------------------------

class - is a complete container
abstract class - is partially complete 

---------------------------------------

interface extends interface -- > yes
interface extends abstract class  --> no
interface extends class  -->  no
interface implements interface --> no
interface implements abstract class  --> no
interface implements class --> no

--------------------------------------

DIFFERENCE between class, abstract class, interface

- object creation 
                 class - yes 
                 abstract, interface - no

- constructors
              class and abstract - yes 
              interface - no

- reference and instance variable 
               class - both allowed  
               abstract - only reference
               interface - only reference

- types of variables 
               class and abstract - no default variables
               interface - all default is as public, abstract and final
- methods 
         class and abstract - no default methods 
         interface - default available --> public abstract

- static and non static blocks 
         class and abstract - both yes
         interface - both no

- static and instance methods 
         class and abstract - both yes
         interface - both no

in terms of sharability:
class  ----- > abstract class  ----- >  interface 


*/

interface i1 {
    int a = 10; // by default, this is public, static, and final
    void m1();
    void m2();
}

interface i2 {
    void m3();
}

interface i3 {
    void m4();
}

abstract class z {
    void met1() {
        System.out.println("method 1 of z class");
    }
    abstract void met2();
}

class p extends z {
    void met2() {
        System.out.println("method 2 of z class");
    }
}

class interf extends p implements i1, i2, i3 {
    public void m1() {
        System.out.println("method 1");
    }

    public void m2() {
        System.out.println("method 2");
    }

    public void m3() {
        System.out.println("method 3");
    }

    public void m4() {
        System.out.println("method 4");
    }

    public static void main(String[] args) {
        i1 o1 = new interf();
        interf o2 = new interf();

        o1.m1();
        o1.m2();
        System.out.println();

        System.out.println(i1.a); // accessing static final variable directly from interface
        System.out.println(interf.a); // accessing static final variable directly from interface
        System.out.println(o2.a);  
        System.out.println(a); 
        System.out.println();

        i2 o3 = new interf();
        o3.m3();

        i3 o4 = new interf();
        o4.m4();

        System.out.println();

        p p_obj = new p();
        p_obj.met1();
        p_obj.met2();
    }
}