package Task2_GradeCalculator;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Student Grade Calculator");

        System.out.println("Enter number of subjects: ");
        int numSubjects =sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for(int i=0; i< numSubjects; i++){
            System.out.println("Enter marks for subjects "+ (i+1) + " (out of 100): ");
            int score =sc.nextInt();

            while(score <0 || score >100){
                System.out.println("Invalid marks! Enter between 0 and 100.");
                System.out.println("Enter marks for Subject "+(i+1) + " again: ");
                score =sc.nextInt();
            }

            marks[i] =score;
            totalMarks+= score;
        }
        double average=(double) totalMarks/numSubjects;
        String grade;

        if(average>=90){
            grade="A";
        }
        else if(average>=80){
            grade="B";
        }
        else if(average>=70){
            grade="C";
        }
        else if(average>=60){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("\nResults: ");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
    }
}
