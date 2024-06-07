// Java Program to demonstrate
// the working of String[] args
// in the main() method

class GeeksforGeeks {

    // Commamd-Line Code ->
    // javac GeeksforGeeks.java
    // java GeeksforGeeks 1 2 3

    public static void main(String[] args)
    {
        for (String elem : args)
            System.out.println(elem);
    }
}
