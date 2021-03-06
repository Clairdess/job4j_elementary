package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByNameIsFalse() {
        PhoneDictionary phones = new PhoneDictionary() {{
            add(new Person("ExactlyNotdetr", "Arsentev", "123123", "Bryansk"));
            add(new Person("asd", "NeArsentev", "345234", "NotFromBryansk"));
        }};
        ArrayList<Person> persons = new ArrayList<>();
        assertThat(phones.find("Who"), is(persons));
    }
}