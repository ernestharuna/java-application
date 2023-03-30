public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person name = " + name;
    }
}

/*
 * .A class, Person, with an instance variable, name. Write appropriate accessor
 * and mutator methods for the class. Also write a toString method for the
 * class.
 */
