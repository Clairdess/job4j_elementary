package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        if (persons == null) {
            return null;
        }
        ArrayList<Person> arrayList = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPhone().contains(key) || person.getAddress().contains(key)
                    || person.getSurname().contains(key) || person.getName().contains(key)) {
                arrayList.add(person);
            }
        }
        return arrayList;
    }
}