package dio.web.api.model;

public class User {
    private Integer id;
    private String login;
    private String password;
    public User() {}
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // Getter for id
    public Integer getId() {
        return id;
    }

    // Setter for id
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for login
    public String getLogin() {
        return login;
    }

    // Setter for login
    public void setLogin(String login) {
        this.login = login;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
