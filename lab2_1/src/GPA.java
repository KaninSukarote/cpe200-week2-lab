/**
 * Implement grading system.
 */
public class GPA {
   float total=0,classes=0;

    public void addGrade(int credit, float grade) {
        total+=credit*grade;
        classes +=credit;

    }


    public float get() {

        if(total==0)return 0.0f;
        return total/classes;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}