public class ConstructorExample {
    String name;
    int age;
    char grade;
    ConstructorExample () {
        this.name = "NA";
        this.age = 0;
        this.grade = 'N';
    }

    public ConstructorExample(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.grade);
    }

    public static void main(String[] args) {
        System.out.println("Varun Rawat (22BCE10512)");
        ConstructorExample ex = new ConstructorExample();
        ex.printDetails();

        ConstructorExample ex2 = new ConstructorExample("Varun", 20, 'S');
        ex2.printDetails();
    }
}
