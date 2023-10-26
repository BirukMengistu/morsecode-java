package User;

public class User {

    private String userName;
    private String passWord;
    public User(String userName, String passWord , int id) {
        this.userName = userName;
        this.passWord = passWord;
        this.id=id;
    }
    public String getUserName()
    {        return userName;    }
    public String getPassWord()
    {        return passWord;    }
    public void updateUserName(String updatedName)
    {        if (updatedName.length() >= 4) {
        userName = updatedName;
    }
    }

    private int id;

}
