import java.util.Scanner;
public class DecisionMakingStatements {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String englishLevel;
        String kiswahiliLevel;
        String mathematicsLevel;
        String integratedScienceLevel;
        String socialStudiesLevel;
        String creativeArtsLevel;
        String religiousEducationLevel;
        String overallGrade;
        String classTeacherRemark;

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

        if (english >= 78) {
            englishLevel = "Exceeding Expectation";
        } else if(english >= 49) {
            englishLevel = "Meeting Expectation";
        } else if(english >= 25) {
            englishLevel = "Approaching Expectation";
        } else {
            englishLevel = "Below Expectation";
        }

        if (kiswahili >= 78) {
            kiswahiliLevel = "Exceeding Expectation";
        } else if(kiswahili >= 49) {
            kiswahiliLevel = "Meeting Expectation";
        } else if(kiswahili >= 25) {
            kiswahiliLevel = "Approaching Expectation";
        } else {
            kiswahiliLevel = "Below Expectation";
        }

        if (mathematics >= 78) {
            mathematicsLevel = "Exceeding Expectation";
        } else if(mathematics >= 49) {
            mathematicsLevel = "Meeting Expectation";
        } else if(mathematics >= 25) {
            mathematicsLevel = "Approaching Expectation";
        } else {
            mathematicsLevel = "Below Expectation";
        }

        if (integratedScience >= 78) {
            integratedScienceLevel = "Exceeding Expectation";
        } else if(integratedScience >= 49) {
            integratedScienceLevel = "Meeting Expectation";
        } else if(integratedScience >= 25) {
            integratedScienceLevel = "Approaching Expectation";
        } else {
            integratedScienceLevel = "Below Expectation";
        }

        if (socialStudies >= 78) {
            socialStudiesLevel = "Exceeding Expectation";
        } else if(socialStudies >= 49) {
            socialStudiesLevel = "Meeting Expectation";
        } else if(socialStudies >= 25) {
            socialStudiesLevel = "Approaching Expectation";
        } else {
            socialStudiesLevel = "Below Expectation";
        }

        if (creativeArts >= 78) {
            creativeArtsLevel = "Exceeding Expectation";
        } else if(creativeArts >= 49) {
            creativeArtsLevel = "Meeting Expectation";
        } else if(creativeArts >= 25) {
            creativeArtsLevel = "Approaching Expectation";
        } else {
            creativeArtsLevel = "Below Expectation";
        }

        if (religiousEducation >= 78) {
            religiousEducationLevel = "Exceeding Expectation";
        } else if(religiousEducation >= 49) {
            religiousEducationLevel = "Meeting Expectation";
        } else if(religiousEducation >= 25) {
            religiousEducationLevel = "Approaching Expectation";
        } else {
            religiousEducationLevel = "Below Expectation";
        }


        int totalScore=english+kiswahili+mathematics+integratedScience+socialStudies+creativeArts+religiousEducation;
        double averageScore=totalScore/7.0;

        if(averageScore >=78) {
            overallGrade = "Exceeding Expectation";
        } else if(averageScore >=49) {
            overallGrade = "Meeting Expectation";
        } else if(averageScore >=24) {
            overallGrade = "Approaching Expectation";
        } else {
            overallGrade = "Below Expectation";
        }

        if(overallGrade == "Exceeding Expectation") {
            classTeacherRemark = "Excellent performance. Keep it up!";
        } else if(overallGrade == "Meeting Expectation") {
            classTeacherRemark = "Good progress. Keep improving.";
        } else if(overallGrade == "Approaching Expectation") {
            classTeacherRemark = "More practice will help improve performance";
        } else {
            classTeacherRemark = "Additional learning support is recommended";
        }

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

        System.out.println("English\t\t\t\t\t"+english+"\t\t\t"+englishLevel);
        System.out.println("Kiswahili\t\t\t\t"+kiswahili+"\t\t\t"+kiswahiliLevel);
        System.out.println("Mathematics\t\t\t\t"+mathematics+"\t\t\t"+mathematicsLevel);
        System.out.println("Integrated Science\t\t"+integratedScience+"\t\t\t"+integratedScienceLevel);
        System.out.println("Social Studies\t\t\t"+socialStudies+"\t\t\t"+socialStudiesLevel);
        System.out.println("Creative Arts\t\t\t"+creativeArts+"\t\t\t"+creativeArtsLevel);
        System.out.println("Religious Education\t\t"+religiousEducation+"\t\t\t"+religiousEducationLevel);
        System.out.println("---------------------------------------------------------");

        System.out.println("TOTAL SCORE:\t\t\t"+totalScore);
        System.out.printf("AVERAGE SCORE:\t\t\t%.2f\n",averageScore);
        System.out.println("POSITION:\t\t\t\t12/96");
        System.out.println("OVERALL GRADE:\t\t\t"+overallGrade);
        System.out.println("---------------------------------------------------------");
        System.out.println("Class Teacher Remark : "+classTeacherRemark);
        System.out.println("Head Teacher Sign    : __________________________________ ");
        System.out.println("==========================================================\n");
    }
}
