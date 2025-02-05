public class WithoutGenerics {
    public static void main(String[] args) {
        Object[] objects = new Object[2];
        objects[0] = "hello";
        String message = (String) objects[0]; //casting needed
        System.out.println(message);
        objects[1] = 40;
        String wrongCast = (String) objects[1]; // runtime error: ClassCastException
        System.out.println(wrongCast);
    }
}
