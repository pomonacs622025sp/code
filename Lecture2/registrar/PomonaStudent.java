package registrar;

public class PomonaStudent {

    private String name;
    private String email;
    private int id;
    private int yearEntered;
    private String academicStanding;
    private boolean graduated;
    private static int studentCounter;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    int getYearEntered() {
        return yearEntered;
    }

    void setYearEntered(int yearEntered) {
        this.yearEntered = yearEntered;
    }

    
    String getAcademicStanding() {
        return academicStanding;
    }


    void setAcademicStanding(String academicStanding) {
        this.academicStanding = academicStanding;
    }

    boolean isGraduated() {
        return graduated;
    }


    void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public static void graduateAllStudents(){
        studentCounter = 0;
     }

    public PomonaStudent(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;
        studentCounter++;
    }

    public String toString(){
        return "Name: " + name + "\nemail: " + email + "\nid: " + id;
    }


    public static void main(String[] args){

        PomonaStudent student1 = new PomonaStudent("name", "email@pomona.edu", 123);
        student1.setYearEntered(2022);
        System.out.println(student1.getYearEntered());
        System.out.println(studentCounter);
        graduateAllStudents();
        System.out.println(studentCounter); 

        PomonaStudent student2 = new PomonaStudent("Ravi Kumar", "rkjc2023@mypomona.edu", 1234);
        System.out.println(student2);

    }

}
