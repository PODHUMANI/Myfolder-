import java.util.Scanner;

class Main {
    String sname;
    int sage, smark;
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an object of Main class to access instance variables
        Main student = new Main();

        System.out.print("Enter the Student Name: ");
        student.sname = sc.nextLine();
       
        System.out.print("Enter the Student Age: ");
        student.sage = sc.nextInt();
       
        System.out.print("Enter the Student Marks: ");
        student.smark = sc.nextInt();
       
        // Call the non-static method using the object
        student.add();

        // Close Scanner
        sc.close();
    }

    public void add() {
        if ((sname != null && sage > 0) && smark >= 0) {
            System.out.println("Stored Successfully!");
        } else {
            if(sname.isEmpty()){
            System.out.println("Invalid  sname");
             }
            else if(sage<=0)
            {
                System.out.println("Invalid  sage");
                 
            }
            else //if()
            {
                System.out.println("invalid mark");
               
            }
        }
       
    }
}
