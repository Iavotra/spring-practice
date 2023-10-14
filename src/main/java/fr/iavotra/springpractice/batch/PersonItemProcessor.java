package fr.iavotra.springpractice.batch;

import fr.iavotra.springpractice.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) {
        log.info("Converting Person");
        return new Person(person.getFirstName().toUpperCase(), person.getLastName().toUpperCase());
    }

}
