package models;

import java.sql.Date;

public class Angajat extends Person{
    private String job;
    private Integer salary;

    private Date hireDate;

    public Angajat(String name, Integer id, String cnp, String job, Integer salary, Date hireDate) {
        super(name, id, cnp);
        this.job = job;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getJob() {
        return job;
    }

    public Integer getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Angajat{" + "name=" + name + ", id=" + id + ", cnp=" + cnp + ", job=" + job + ", salary=" + salary + ", hireDate=" + hireDate + '}';
    }
}
