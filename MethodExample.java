public class MethodExample {
    public void printName(String name) {
        System.out.println("Name: " + name);
    }
    public void printAge(int age) {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Varun Rawat (22BCE10512)");
        MethodExample ex = new MethodExample();
        ex.printName("Varun");
        ex.printAge(20);
    }
}
