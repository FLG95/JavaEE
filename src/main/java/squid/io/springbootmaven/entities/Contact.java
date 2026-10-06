package squid.io.springbootmaven.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Contact implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private int note;


    public Contact(){
        super();
    }
    public Contact(String name, String email, int note) {
        super();
        this.name = name;
        this.email = email;
        this.note = note;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + "name=" + name + "email=" + email + "]";

    }

}
