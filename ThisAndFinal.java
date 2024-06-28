public class ThisAndFinal {
    private int age;
    private final String name = "Varun";

    public ThisAndFinal(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Varun Rawat (22BCE10512)");
        ThisAndFinal ex = new ThisAndFinal(20);
        ex.display();
    }

}
