import java.util.Scanner;
public class GettingInputsAssignment {
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
        System.out.print("Enter current term: ");
        String term = keyboard.nextLine();
        String school="Mwangaza Primary School";
        String grade="Grade 6";
        String county="Nyeri";

        // English
        System.out.println("\nENTER ENGLISH ASSESSMENT MARKS");
        System.out.print("Start of Term: ");
        int englishStart = keyboard.nextInt();
        System.out.print("Midterm (CAT): ");
        int englishMid = keyboard.nextInt();
        System.out.print("End of Term: ");
        int englishEnd = keyboard.nextInt();

        // Kiswahili
        System.out.println("\nENTER KISWAHILI ASSESSMENT MARKS");
        System.out.print("Start of Term: ");
        int kiswahiliStart = keyboard.nextInt();
        System.out.print("Midterm (CAT): ");
        int kiswahiliMid = keyboard.nextInt();
        System.out.print("End of Term: ");
        int kiswahiliEnd = keyboard.nextInt();

        // Mathematics
        System.out.println("\nENTER MATHEMATICS ASSESSMENT MARKS");
        System.out.print("Start of Term: ");
        int mathematicsStart = keyboard.nextInt();
        System.out.print("Midterm (CAT): ");
        int mathematicsMid = keyboard.nextInt();
        System.out.print("End of Term: ");
        int mathematicsEnd = keyboard.nextInt();

        // Integrated Science
        System.out.println("\nENTER INTEGRATED SCIENCE ASSESSMENT MARKS");
        System.out.print("Start of Term: ");
        int scienceStart = keyboard.nextInt();
        System.out.print("Midterm (CAT): ");
        int scienceMid = keyboard.nextInt();
        System.out.print("End of Term: ");
        int scienceEnd = keyboard.nextInt();

        // Social Studies
        System.out.println("\nENTER SOCIAL STUDIES ASSESSMENT MARKS");
        System.out.print("Start of Term: ");
        int socialStart = keyboard.nextInt();
        System.out.print("Midterm (CAT): ");
        int socialMid = keyboard.nextInt();
        System.out.print("End of Term: ");
        int socialEnd = keyboard.nextInt();

        // Creative Arts
        System.out.println("\nENTER CREATIVE ARTS ASSESSMENT MARKS");
        System.out.print("Start of Term: ");
        int artsStart = keyboard.nextInt();
        System.out.print("Midterm (CAT): ");
        int artsMid = keyboard.nextInt();
        System.out.print("End of Term: ");
        int artsEnd = keyboard.nextInt();

        // Religious Education
        System.out.println("\nENTER RELIGIOUS EDUCATION ASSESSMENT MARKS");
        System.out.print("Start of Term: ");
        int religiousStart = keyboard.nextInt();
        System.out.print("Midterm (CAT): ");
        int religiousMid = keyboard.nextInt();
        System.out.print("End of Term: ");
        int religiousEnd = keyboard.nextInt();

        double englishFinal = (englishStart + englishMid + englishEnd) / 3.0;
        double kiswahiliFinal = (kiswahiliStart + kiswahiliMid + kiswahiliEnd) / 3.0;
        double mathematicsFinal = (mathematicsStart + mathematicsMid + mathematicsEnd) / 3.0;
        double scienceFinal = (scienceStart + scienceMid + scienceEnd) / 3.0;
        double socialFinal = (socialStart + socialMid + socialEnd) / 3.0;
        double artsFinal = (artsStart + artsMid + artsEnd) / 3.0;
        double religiousFinal = (religiousStart + religiousMid + religiousEnd) / 3.0;

        if (englishFinal >= 75) {
            englishLevel = "Exceeding Expectation";
        } else if (englishFinal >= 41) {
            englishLevel = "Meeting Expectation";
        } else if (englishFinal >= 21) {
            englishLevel = "Approaching Expectation";
        } else {
            englishLevel = "Below Expectation";
        }

        if (kiswahiliFinal >= 75) {
            kiswahiliLevel = "Exceeding Expectation";
        } else if (kiswahiliFinal >= 41) {
            kiswahiliLevel = "Meeting Expectation";
        } else if (kiswahiliFinal >= 21) {
            kiswahiliLevel = "Approaching Expectation";
        } else {
            kiswahiliLevel = "Below Expectation";
        }

        if (mathematicsFinal >= 75) {
            mathematicsLevel = "Exceeding Expectation";
        } else if (mathematicsFinal >= 41) {
            mathematicsLevel = "Meeting Expectation";
        } else if (mathematicsFinal >= 21) {
            mathematicsLevel = "Approaching Expectation";
        } else {
            mathematicsLevel = "Below Expectation";
        }

        if (scienceFinal >= 75) {
            integratedScienceLevel = "Exceeding Expectation";
        } else if (scienceFinal >= 41) {
            integratedScienceLevel = "Meeting Expectation";
        } else if (scienceFinal >= 21) {
            integratedScienceLevel = "Approaching Expectation";
        } else {
            integratedScienceLevel = "Below Expectation";
        }

        if (socialFinal >= 75) {
            socialStudiesLevel = "Exceeding Expectation";
        } else if (socialFinal >= 41) {
            socialStudiesLevel = "Meeting Expectation";
        } else if (socialFinal >= 21) {
            socialStudiesLevel = "Approaching Expectation";
        } else {
            socialStudiesLevel = "Below Expectation";
        }

        if (artsFinal >= 75) {
            creativeArtsLevel = "Exceeding Expectation";
        } else if (artsFinal >= 41) {
            creativeArtsLevel = "Meeting Expectation";
        } else if (artsFinal >= 21) {
            creativeArtsLevel = "Approaching Expectation";
        } else {
            creativeArtsLevel = "Below Expectation";
        }

        if (religiousFinal >= 75) {
            religiousEducationLevel = "Exceeding Expectation";
        } else if (religiousFinal >= 41) {
            religiousEducationLevel = "Meeting Expectation";
        } else if (religiousFinal >= 21) {
            religiousEducationLevel = "Approaching Expectation";
        } else {
            religiousEducationLevel = "Below Expectation";
        }

        double totalFinalMarks = englishFinal + kiswahiliFinal + mathematicsFinal + scienceFinal + socialFinal + artsFinal + religiousFinal;
        double averageScore = totalFinalMarks / 7.0;

        if(averageScore >=75) {
            overallGrade = "Exceeding Expectation";
        } else if(averageScore >=41) {
            overallGrade = "Meeting Expectation";
        } else if(averageScore >=21) {
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

        System.out.println("====================================================================================================");
        System.out.println("                        MWANGAZA PRIMARY SCHOOL");
        System.out.println("                KPSEA PREPARATION REPORT CARD (TERM ASSESSMENT)");
        System.out.println("====================================================================================================\n");

        System.out.println("Candidate name:\t "+candidateName+"\t\t|\tTerm\t:\t"+term);
        System.out.println("Assessment No :\t "+assessmentNo+"\t\t|\tSchool\t:\t"+school);
        System.out.println("Grade         :\t "+grade+"\t\t\t\t|\tCounty\t:\t"+county);
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("|\tSUBJECT\t\t\t\t\t|\tSTART\t|\tMIDTERM\t|\tEND\t\t|\tFINAL\t|\tLEVEL");
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.printf("|\tEnglish\t\t\t\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%.1f\t|\t%s\n", englishStart, englishMid, englishEnd, englishFinal, englishLevel);
        System.out.printf("|\tKiswahili\t\t\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%.1f\t|\t%s\n", kiswahiliStart, kiswahiliMid, kiswahiliEnd, kiswahiliFinal, kiswahiliLevel);
        System.out.printf("|\tMathematics\t\t\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%.1f\t|\t%s\n", mathematicsStart, mathematicsMid, mathematicsEnd, mathematicsFinal, mathematicsLevel);
        System.out.printf("|\tIntegrated Science\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%.1f\t|\t%s\n", scienceStart, scienceMid, scienceEnd, scienceFinal, integratedScienceLevel);
        System.out.printf("|\tSocial Studies\t\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%.1f\t|\t%s\n", socialStart, socialMid, socialEnd, socialFinal, socialStudiesLevel);
        System.out.printf("|\tCreative Arts\t\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%.1f\t|\t%s\n", artsStart, artsMid, artsEnd, artsFinal, creativeArtsLevel);
        System.out.printf("|\tReligious Education\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%.1f\t|\t%s\n", religiousStart, religiousMid, religiousEnd, religiousFinal, religiousEducationLevel);

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.printf("TOTAL FINAL MARKS:\t\t\t\t\t\t\t\t%.1f/700\n",totalFinalMarks);
        System.out.printf("AVERAGE FINAL MARK:\t\t\t\t\t\t\t\t%.2f\n",averageScore);
        System.out.println("POSITION:\t\t\t\t\t\t\t\t\t\t12/96");
        System.out.println("OVERALL LEVEL:\t\t\t\t\t\t\t\t\t"+overallGrade);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Class Teacher Remark : "+classTeacherRemark);
        System.out.println("Head Teacher Sign    : ____________________________________ ");
        System.out.println("====================================================================================================\n");
    }
}
