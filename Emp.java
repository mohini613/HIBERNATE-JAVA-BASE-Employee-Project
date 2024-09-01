package com.empPro;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Emp {

    @Id
    private int Eid;

    private String Ename;
    private int Esalary;

    @OneToOne
    private Project p;

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public int getEsalary() {
        return Esalary;
    }

    public void setEsalary(int esalary) {
        Esalary = esalary;
    }

    public Project getProject() {
        return p;
    }

    public void setProject(Project p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Emp [Eid=" + Eid + ", Ename=" + Ename + ", Esalary=" + Esalary + ", Project=" + p + "]";
    }
}
