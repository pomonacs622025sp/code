package registrar;

class PomonaStudent implements Enrollable{

    private String name;
    private String email;
    private int id;
    private String major;

    private static int studentCounter;
    
    protected PomonaStudent(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;
        studentCounter++;
        major = "Undeclared";
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getEmail() {
        return email;
    }


    protected void setEmail(String email) {
        this.email = email;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected static int getStudentCounter(){
        return studentCounter;
    }

    protected String getMajor(){
        return major;
    }

    protected void setMajor(String major){
        this.major = major;
    }

    public String toString(){
        return "Pomona Student Info - Name: " + name + "\nemail: " + email + "\nid: " + id + "\n";
    }

    public void enrollInCourse(String course) {
        // implementation
    }

    public void withdrawFromCourse(String course) {
        // implementation
    }

    public void viewCourseSchedule() {
        // implementation
    }

    public static void main(String args[]){
        PomonaStudent student1 = new PomonaStudent("Ravi Kumar", "rkjc2023@mypomona.edu", 1234);
        System.out.println(student1);
    }

}
