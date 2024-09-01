package com.empPro;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    private int Pid;

    private String Pname;

    @OneToOne
    private Emp e;

    // Getters and setters

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public Emp getEmp() {
        return e;
    }

    public void setEmp(Emp e) {
        this.e = e;
    }

    /*@Override
    public String toString() {
        return "Project [Pid=" + Pid + ", Pname=" + Pname + ", emp=" + e + "]";
    }*/
}
