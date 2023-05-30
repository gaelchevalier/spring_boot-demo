package fr.example.demo.bll;

import fr.example.demo.bo.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    List<Person> persons;

    PersonService() {
        persons = new ArrayList<>();
//        persons = Arrays.asList(new Person[] {
//            new Person("Gaw", "Knight", "gknight"),
//            new Person("John", "Doe", "jod"),
//            new Person("Jane", "Doe", "jane")
//        });
        persons.add(new Person("Gaw", "Knight", "gknight"));
        persons.add(new Person("John", "Doe", "jod"));
        persons.add(new Person("Jane", "Doe", "jane"));
    }

    public List<Person> getAll() {
        return persons;
    }

    public Person getPersonBySlug(String slug) {
        for (Person person : persons) {
            if (person.getSlug().equals(slug)) {
                return person;
            }
        }
        return null;
    }

    public void addPerson (Person person) {
        persons.add(person);
    }

    public void editPerson (Person person) {

    }
}
