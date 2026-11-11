import java.util.Scanner;
public class Creatinginputs {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter candidate name: ");
        String candidateName = keyboard.nextLine();
        System.out.print("Enter candidate assessment number: ");
        String assessmentNo=keyboard.nextLine();
        String school="Mwangaza Primary School";
        String grade="Grade 6";
        String county="Nyeri";

        System.out.print("Input candidate's English score: ");
        int english = keyboard.nextInt();
        System.out.print("Input candidate's Kiswahili score: ");
        int kiswahili = keyboard.nextInt();
        System.out.print("Input candidate's Mathematics score: ");
        int mathematics = keyboard.nextInt();
        System.out.print("Input candidate's Integrated Science score: ");
        int integratedScience = keyboard.nextInt();
        System.out.print("Input candidate's Social Studies score: ");
        int socialStudies = keyboard.nextInt();
        System.out.print("Input candidate's Creative Arts score: ");
        int creativeArts = keyboard.nextInt();
        System.out.print("Input candidate's Religious Education score: ");
        int religiousEducation = keyboard.nextInt();

        int totalScore=english+kiswahili+mathematics+integratedScience+socialStudies+creativeArts+religiousEducation;
        double averageScore=totalScore/7.0;

        System.out.println("==========================================================");
        System.out.println("                KPSEA EXAM REPORT CARD");
        System.out.println("==========================================================\n");

        System.out.println("Candidate name:\t "+candidateName);
        System.out.println("Assessment No :\t "+assessmentNo);
        System.out.println("School        :\t "+school);
        System.out.println("Grade         :\t "+grade);
        System.out.println("County        :\t "+county);

        System.out.println("---------------------------------------------------------");
        System.out.println("SUBJECT\t\t\t\t\tSCORE\t\tLEVEL");
        System.out.println("---------------------------------------------------------");

        System.out.println("English\t\t\t\t\t"+english+"\t\t\tExceeding Expectation");
        System.out.println("Kiswahili\t\t\t\t"+kiswahili+"\t\t\tMeeting Expectation");
        System.out.println("Mathematics\t\t\t\t"+mathematics+"\t\t\tExceeding Expectation");
        System.out.println("Integrated Science\t\t"+integratedScience+"\t\t\tMeeting Expectation");
        System.out.println("Social Studies\t\t\t"+socialStudies+"\t\t\tMeeting Expectation");
        System.out.println("Creative Arts\t\t\t"+creativeArts+"\t\t\tExceeding Expectation");
        System.out.println("Religious Education\t\t"+religiousEducation+"\t\t\tExceeding Expectation");
        System.out.println("---------------------------------------------------------");

        System.out.println("TOTAL SCORE:\t\t\t"+totalScore);
        System.out.printf("AVERAGE SCORE:\t\t\t%.2f\n",averageScore);
        System.out.println("POSITION:\t\t\t\t12/96");
        System.out.println("OVERALL GRADE:\t\t\tExceeding Expectation");
        System.out.println("---------------------------------------------------------");
        System.out.println("Class Teacher Remark : Very good performance. Keep it up.");
        System.out.println("Head Teacher Sign    : __________________________________ ");
        System.out.println("==========================================================\n");
    }
}
