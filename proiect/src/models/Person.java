package models;

public class Person {
    protected String name;
    protected Integer id;
    protected String cnp;

    public Person(String name, Integer id, String cnp) {
        this.name = name;
        this.id = id;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", cnp=" + cnp + '}';
    }

}
