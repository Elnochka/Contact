package com.example;


import javax.persistence.*;

/**
 * Created by Елена on 16.06.16.
 */
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;

    protected Contact() {

    }


    public Contact(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Contact(String name) {

        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
