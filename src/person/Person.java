package person;

import registration.Reg;
import registration.Registration;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Person extends Registration implements Reg {
    private String log;
    private String pass;
    private long[] ID;
    private String firstName;
    private String lastName;
    private String DateOfBirth;

    public Person() {
    }

    public Person(String login, String password, String log,
                  String pass, long[] ID, String firstName, String lastName, String dateOfBirth) {
        super(login, password);
        this.log = log;
        this.pass = pass;
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        DateOfBirth = dateOfBirth;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long[] getID() {
        return ID;
    }

    public void setID(long[] ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
    @Override
    public void Registration() {
        System.out.println("\tРегистрация\n");
    }

    public long rm(){
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < ID.length; i++) {
            ID[i] = random.nextLong(10000000, 100000000);
        }
        return sum;
    }

    @Override
    public void R() {
        System.out.println("\tРегистрация успешно!\n");
    }

    @Override
    public void SignIn() {
        System.out.println("\tВойдите в аккаунт\n");
    }

    @Override
    public void Vv() {
        System.out.println("\n\tВы вошли в аккаунт!");
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nID: " + Arrays.toString(ID) +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nDate of Birth: " + DateOfBirth;
    }
}