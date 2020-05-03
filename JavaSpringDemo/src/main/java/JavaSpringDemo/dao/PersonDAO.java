package JavaSpringDemo.dao;

import JavaSpringDemo.model.Person;

import java.util.UUID;

public interface PersonDAO {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return  insertPerson(id,person);
    }
}
