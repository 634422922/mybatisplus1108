package com.ujiuye.bean;

public class dsd {
    private String did;
    private String dname;

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }
         new dsd()String;

    public dsd() {
    }

    public String getDid() {
        return did;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public dsd(String did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "dsd{" +
                "did='" + did + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }
}
