package registrar;

class FirstYearPomonaStudent extends PomonaStudent{

    private String id1;
    private static int firstYearCounter;


    protected FirstYearPomonaStudent(String name, String email, int id, String id1){
        super(name, email, id);
        this.id1 = id1;
        firstYearCounter++;
    }

    protected String getId1(){
        return id1;
    }

    protected void setID1(String id1){
        this.id1 = id1;
    }

    public String toString(){
        return super.toString() + "First-Year Student Attending ID1: " + id1;
    }

    public static void main(String args[]){
        FirstYearPomonaStudent student1 = new FirstYearPomonaStudent("Ravi Kumar", "rkjc2023@mypomona.edu", 1234, "CS62");
        System.out.println(student1);
        System.out.println(student1.getMaxCredits());
    }
}
