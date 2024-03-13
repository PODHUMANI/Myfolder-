class Base {
    public static void show() {
       System.out.println("Base::show() called");// output
    }
}
  
class Derived extends Base {
    public static void show() {
       System.out.println("Derived::show() called");//not static print the output 
    }
}
  
class Main {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}
