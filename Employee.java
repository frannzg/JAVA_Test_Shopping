public class Employee {
    private String name;
    private String lastName;
    private int age;
    private String category;
    private boolean isMandated;
    private Work work;

    public Employee(String name, String lastName, int age, String categoty, boolean isMandated, Work work){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.category = categoty;
        this.isMandated = isMandated;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18){
            this.age = age;
        } else {
            throw new IllegalArgumentException("The age must be greater than 18");
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isIsMandated() {
        return isMandated;
    }

    public void setIsMandated(boolean isMandated) {
        this.isMandated = isMandated;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", category = '" + category + '\'' +
                ", isMandated = " + isMandated + "\n" +
                ", Work = " + work +
                '}';
    }


}