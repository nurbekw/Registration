package Logic;

import person.Person;
import registration.Registration;

import java.util.Objects;
import java.util.Scanner;

public  class Logic extends Registration {
    private Person person;

    public Logic() {
    }

    public Logic(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public  void L(){
    Scanner scanner = new Scanner(System.in);
    long[] array = new long[1];
    Person person = new Person();
        person.Registration();
        System.out.print("Login: ");
        person.setLogin(scanner.nextLine());
        System.out.print("Password: ");
        person.setPassword(scanner.nextLine());
        person.R();
        System.out.print("Введите имя: ");
        person.setFirstName(scanner.nextLine());
        System.out.print("Введите фамилию: ");
        person.setLastName(scanner.nextLine());
        System.out.print("Введите дату рождения: ");
        person.setDateOfBirth(scanner.nextLine());
        person.SignIn();
        System.out.print("login: ");
        person.setLog(scanner.nextLine());
        person.setID(array);
        if (Objects.equals(person.getLog(), person.getLogin())) {
        System.out.print("password: ");
        person.setPass(scanner.nextLine());
        if (Objects.equals(person.getPass(), person.getPassword())) {
            person.Vv();
            person.rm();
            System.out.println(person);
        } else
            System.out.println("Пароль или логин введен не правильно!!!");
    } else
            System.out.println("Пароль или логин введен не правильно!!!");
    }
}
