package registrar;

//a silly (bad) example for 2nd generation classes still accessing 
//grandparent information
class SecondYearPomonaStudentMale extends SecondYearPomonaStudent {
    protected SecondYearPomonaStudentMale(String name, String email, int id){
        super(name, email, id);
    }

    protected String findName() {
        //call super in a method
        String name = super.getName();
        return name;
    }
    public static void main(String args[]){
        SecondYearPomonaStudentMale student1 = new SecondYearPomonaStudentMale("dude", "dude@pom.edu", 1);
        //access parent methods
        System.out.println(student1.getName());
        System.out.println(student1.findName());

    }
}