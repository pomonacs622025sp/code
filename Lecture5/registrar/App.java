package registrar;

public class App {

    public static void main(String[] args) {

        FirstYearPomonaStudent student1 = new FirstYearPomonaStudent("daniel", "daniel@pomona.edu", 1, "War and Peace");
        FirstYearPomonaStudent student2 = new FirstYearPomonaStudent("wentao", "wentao@pomona.edu", 2, "Color and its Affects");

        FirstYearPomonaStudent[] firstYears = {student1,student2};
        for(FirstYearPomonaStudent firstYear:firstYears){
            System.out.println(firstYear);
            System.out.println(firstYear.getMaxCredits());

        }

        SecondYearPomonaStudent student3 = new SecondYearPomonaStudent("archita", "archita@pomona.edu", 3);
        SecondYearPomonaStudent student4 = new SecondYearPomonaStudent("nedi", "nedi@pomona.edu", 4);

        SecondYearPomonaStudent[] secondYears = {student3,student4};
        for(SecondYearPomonaStudent secondYear:secondYears){
            System.out.println(secondYear.getMaxCredits());
        }

        FourthYearPomonaStudent student5 = new FourthYearPomonaStudent("nicholas", "nicholas@pomona.edu", 5, "Balloons, Mega Blocks, and Trucks: The Decline of American Manufacturing and its Effects on the Middle Class ");
        FourthYearPomonaStudent student6 = new FourthYearPomonaStudent("antonis", "antonis@pomona.edu", 6, "Savoir Vivre Around the World");

        FourthYearPomonaStudent[] fourthYears = {student5,student6};
        for(FourthYearPomonaStudent fourthYear:fourthYears){
            System.out.println(fourthYear.getThesisTitle());
        }

        PomonaStudent student7 = new FirstYearPomonaStudent("alex", "alex@pomona.edu", 1, "Humans through the eyes of technology");
        System.out.println(student7.getMaxCredits());
        //student advances to next class
        student7 = new SecondYearPomonaStudent(student7.getName(), student7.getEmail(), student7.getId());
        System.out.println(student7.getMaxCredits());

        
        PomonaStudent[] students = new PomonaStudent[7];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        for(PomonaStudent student: students){
            System.out.println(student);
        }

    }
}
