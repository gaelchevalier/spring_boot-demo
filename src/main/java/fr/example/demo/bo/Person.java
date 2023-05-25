package fr.example.demo.bo;

public class Person {

    protected String firstname;
    protected String lastname;
    protected String slug;

    /**
     * Constructor
     * @param firstname
     * @param lastname
     * @param slug
     */
    public Person(String firstname, String lastname, String slug) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.slug = slug;
    }

    // Getters & Setters
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
