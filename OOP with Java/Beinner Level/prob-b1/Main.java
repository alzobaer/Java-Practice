public class Main {
    
    public static void main(String[] args) {
        Person obj = new Person();

        String name = obj.name;
        int age = obj.age;
        String country = obj.country;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Age: " + age);
    }
}
