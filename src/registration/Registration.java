package registration;

public abstract class Registration {
    private String login;
    private String password;

    public Registration() {
    }

    public Registration(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void Registration(){

    }

    @Override
    public String toString() {
        return
                "\nlogin  " + login ;
    }
}
