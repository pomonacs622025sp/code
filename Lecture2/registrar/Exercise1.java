package registrar;

public class Exercise1 {
    int x;
    String message;
    static int y = 0;

    public Exercise1(int x) {
        this.x = x; 
    }
    public void setMessage(String msg) {
        this.message = msg;
    }
    public String yell(){
        return message;
    }
    public static int add(int x){
        return x + y;
    }

    public static boolean isPalindrome(String s){

		// base case when length of word is 1 or 0

		if (s.length() <= 1) {

        	return true;

   		}


		// recursive case when first and last character are the same, moves to 

		// return word as substring with first and last characters deleted 

		if (s.charAt(s.length() - 1) == s.charAt(0)) {

			return isPalindrome(s.substring(1, s.length() - 1));

		}
		return false;

	}


    public void test() {
        System.out.print("hi");
    }
    public static void main(String[] args) {
        Exercise1 obj1 = new Exercise1(y);
        System.out.println(obj1.x);
        y = 7;
        // obj1.message = "bark";
        obj1.setMessage("bark");
        System.out.println(add(4));
        obj1.setMessage("meow");
        System.out.println(obj1.yell());

        System.out.println(isPalindrome("Noon"));
        System.out.println(isPalindrome("tacocat"));
        System.out.println(isPalindrome("Pamana"));


    }
}
