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
        SecondYearPomonaStudent student1 = new SecondYearPomonaStudent("Ravi Kumar", "rkjc2023@mypomona.edu", 1234);
        System.out.println(student1);
        System.out.println(student1.getMaxCredits());
    }
    
}
