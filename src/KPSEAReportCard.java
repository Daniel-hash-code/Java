public class KPSEAReportCard {
    public static void main(String args[]) {
        String candidateName="Joy Wanjiku Mwangi";
        String assessmentNo="KPSEA-2016-01458";
        String school="Mwangaza Primary School";
        String grade="Grade 6";
        String county="Nyeri";

        int english=78;
        int kiswahili=74;
        int mathematics=81;
        int integratedScience=76;
        int socialStudies=73;
        int creativeArts=85;
        int religiousEducation=80;

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
