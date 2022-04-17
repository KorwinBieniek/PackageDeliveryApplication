package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")

public class Client implements Serializable {

    private String name;
    private String surname;
    private String type;
    private String regularCollection;
    private ArrayList<Package> packages;

    public Client() {
    }

    public Client(String name, String surname, String type, String regularCollection, ArrayList<Package> packages) {
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.regularCollection = regularCollection;
        this.packages = packages;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Package> getPackages() {
        return packages;
    }

    public void setPackages(ArrayList<Package> packages) {
        this.packages = packages;
    }

    @Id
    public String getSurname() {
        return this.surname;
    }

    public void setName(String id) {
        this.name = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getRegularCollection() {
        return regularCollection;
    }

    public void setRegularCollection(String regularCollection) {
        this.regularCollection = regularCollection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
