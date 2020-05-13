package Steps;

public class DataClass {

    public String username;
    public String password;
    public String info;

    public DataClass(String username, String password, String info)
    {
        this.username = username;
        this.password = password;
        this.info = info;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getInfo()
    {
        return Integer.parseInt(info);
    }

    public void setInfo(String info)
    {
        this.info = info;
    }
}
