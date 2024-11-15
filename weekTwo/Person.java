package weekTwo;

public class Person {
    private String name;
    private String email;
    private int age;
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {}
        this.age = age;
    }
}
