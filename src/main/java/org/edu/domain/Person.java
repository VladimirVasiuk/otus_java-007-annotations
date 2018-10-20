package org.edu.domain;

// TODO: добавьте аннотацию @VpRu на этот класс, и проверьте её наличие
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO: поставьте аннотацию @Normal("Ivan") на анные методы и сравните результат вызова с параметром аннотации
    public String getName() {
        return name;
    }

    // TODO: @Normal(24)
    public int getAge() {
        return age;
    }
}
