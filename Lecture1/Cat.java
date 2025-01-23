import java.util.Arrays;

public class Cat {

    String name;
    String sex;
    int age;
    int daysInRescue;
    boolean adopted;
    
    public Cat(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    static int[] two_sum(int[] nums, int target) {
        int[] answer = {0,0};
        int num1;
        int num2;
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            for (int j = i; j < nums.length; j++) {
                num2 = nums[j];
                if (num1 + num2 == target) {
                    answer[0] = num1;
                    answer[1] = num2;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){

        Cat cat1 = new Cat("Sesame", "female", 3);
        Cat cat2 = new Cat("Mochi", "unknown", 1);
        cat1.daysInRescue = 3;
        cat2.daysInRescue = 47;
        cat2.adopted = true;

        int[] test = {2,7,11,15};
        System.out.println(test);
        System.out.println(Arrays.toString(two_sum(test, 13)));

    }

}
