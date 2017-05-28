package Models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Burak Köken on 28.5.2017.
 */
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @TableGenerator(name = "AdditionalTable", table = "AdditionalTable", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "AdditionalTable")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthDate")
    private Date birthDate;

    @Column(name = "salary")
    private int salary;

    @Column(name = "address")
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
