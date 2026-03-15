public class Person {

    String firstName, lastName;

    public Person() {
        firstName = "";
        lastName = "";
    }

    public Person(String first, String last) {
        setName(first, last);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        }
    }

    public void set(String first, String last) {
        setName(first, last);
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public void print() {
        System.out.print(firstName + " " + lastName + " ");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        Person p = (Person) obj;
        return firstName.equals(p.getFirstName()) && lastName.equals(p.getLastName());
    }

    public boolean notEquals(Person other) {
        return !(equals(other));
    }

    public void copy(Object obj) {
        if (!(obj instanceof Person))
            return;
        Person p = (Person) obj;
        setName(p.getFirstName(), p.getLastName());
    }

    public Person getCopy() {
        return new Person(firstName, lastName);
    }
}
