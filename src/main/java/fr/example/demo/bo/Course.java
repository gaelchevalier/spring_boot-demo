package fr.example.demo.bo;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    public Course() {
    }
    public Course(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Course(String title) {
        this.title = title;
    }
}
