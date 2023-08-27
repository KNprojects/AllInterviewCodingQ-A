package main.java.com.niha.Entity;

public class Employee {

    private String id;

    private String name;
    private String Age;
    private String salary;

    private String gender;

    public Employee(int i, String jiyaBrein, int i1, String female, String hr, int yearOfJoining, double v) {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + Age + '\'' +
                ", salary='" + salary + '\'' +
                ", gender='" + gender + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", department='" + department + '\'' +
                '}';
    }

    private Integer yearOfJoining;

    private String department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        this.Age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String id, String name, String age, String salary, String gender, Integer yearOfJoining, String department) {
        this.id = id;
        this.name = name;
        this.Age = age;
        this.salary = salary;
        this.gender = gender;
        this.yearOfJoining = yearOfJoining;
        this.department = department;
    }

    public Integer getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(Integer yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
