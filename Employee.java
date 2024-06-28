public class Employee {

    String name;
    String ID;
    int basic_pay;
    int dearness_allowance;
    int house_rent_allowance;

    Employee (String name, String ID, int basic_pay) {
        this.name = name;
        this.ID = ID;
        this.basic_pay = basic_pay;
        this.dearness_allowance = (int)(basic_pay*(0.25));
        this.house_rent_allowance = (int)(basic_pay*(0.05));
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getBasic_pay() {
        return basic_pay;
    }

    public int getDearness_allowance() {
        return dearness_allowance;
    }

    public int getHouse_rent_allowance() {
        return house_rent_allowance;
    }

    void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.ID);
        System.out.println("Basic Pay: " + this.basic_pay);
        System.out.println("Dearness Allowance: " + this.dearness_allowance);
        System.out.println("House Rent Allowance: " + this.house_rent_allowance);
    }

    public static void main(String[] args) {
        System.out.println("Varun Rawat (22BCE10512)");
        Employee varun = new Employee("Varun", "123", 125000);
        varun.printEmployee();
    }
}
