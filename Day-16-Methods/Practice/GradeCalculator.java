public class GradeCalculator {
    
    public static char getGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Marks 85: Grade " + getGrade(85));
        System.out.println("Marks 92: Grade " + getGrade(92));
        System.out.println("Marks 55: Grade " + getGrade(55));
    }
}
