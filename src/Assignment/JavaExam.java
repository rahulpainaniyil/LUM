package Assignment;
public class rooms {
    int rollNo;
    String name;
    double marks;
    public void store(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to display details
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating an object of Room
        rooms student = new rooms();
        
        // Assigning values
        student.store(1, "John Doe", 85.5);

        // Printing details
        student.display();
    }
}
