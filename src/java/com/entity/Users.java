public class ueses{
    private String Username;
    private String password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ueses{" +
                "Username='" + Username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}