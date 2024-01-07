public class App {
    public static void main(String[] args) throws Exception {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);

        Director director = new Director("Nada", "IT", 5000, 7000);
        String[] kidSkills = { "Java", "Android" };
        Engineer engineer = new Engineer("Nada", "IT", 3000, kidSkills);
        SalesPerson sales = new SalesPerson("Person", "Sales", 2500, 5000);

        System.out.println(director);
        System.out.println(engineer);
        System.out.println(sales);
    }
}
