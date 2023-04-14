public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.a = 5;
        triangle.b = 5;
        triangle.c = 5;

        System.out.println(triangle.a+"."+triangle.b+"."+ triangle.c);
        triangle.area();


    }
}