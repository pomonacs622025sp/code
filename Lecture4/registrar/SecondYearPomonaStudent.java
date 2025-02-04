package registrar;

class SecondYearPomonaStudent extends PomonaStudent{
    private static int secondYearCounter;

    protected SecondYearPomonaStudent(String name, String email, int id){
        super(name, email, id);
        secondYearCounter++;
    }

    @Override
    protected int getMaxCredits(){
        return 6;
    }

    public String toString(){
        return super.toString() + "Second-Year Student can Take: " + getMaxCredits() +" credits";
    }

    public static void main(String args[]){
        // SecondYearPomonaStudent student1 = new SecondYearPomonaStudent("Ravi Kumar", "rkjc2023@mypomona.edu", 1234);
        // System.out.println(student1);
        // System.out.println(student1.getMaxCredits());


        FirstYearPomonaStudent student1 = new FirstYearPomonaStudent("Daniel", "daniel@pomona.edu", 1, "War and Peace");
        SecondYearPomonaStudent student2 = new SecondYearPomonaStudent("Archita", "archita@pomona.edu", 3);
        FourthYearPomonaStudent student3 = new FourthYearPomonaStudent("Antonio", "antonio@pomona.edu", 6, "Savoir Vivre Around the World");
        PomonaStudent[] students = new PomonaStudent[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        for(PomonaStudent student: students) {
            System.out.println(student); //appropriate overriden toString method
            //student.getID1(); //would not work; not a method of the super class
        }

        // PomonaStudent student7 = new FirstYearPomonaStudent("Alex", "alex@pomona.edu", 1, "Humans through the eyes of technology");
        // System.out.println(student7.getMaxCredits()); //prints 4
        // //student7 turns into a sophomore
        // student7 = new SecondYearPomonaStudent(student7.getName(), student7.getEmail(), student7.getId());
        // System.out.println(student7.getMaxCredits()); //now prints 6



    }
    
}
