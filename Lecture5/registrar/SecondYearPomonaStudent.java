package registrar;

class SecondYearPomonaStudent extends PomonaStudent{
    private static int secondYearCounter;

    protected SecondYearPomonaStudent(String name, String email, int id){
        super(name, email, id);
        secondYearCounter++;
    }

    public int getMaxCredits(){
        return 6;
    }

    public String toString(){
        return super.toString() + "Second-Year Student can Take: " + getMaxCredits() +" credits";
    }
    
}
