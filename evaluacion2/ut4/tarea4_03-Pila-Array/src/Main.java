public class Main {
    public static void main(String[] args) {
        Stack array = new Stack(3);

        array.push("1");
        array.push("2");

        System.out.println(array.show());
        System.out.println(array.search("2"));
        System.out.println(array.search("4"));
        array.pop();
        System.out.println(array.show());


    }
}