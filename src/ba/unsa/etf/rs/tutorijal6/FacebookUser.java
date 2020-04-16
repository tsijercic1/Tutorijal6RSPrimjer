package ba.unsa.etf.rs.tutorijal6;

import java.time.LocalDate;

public class FacebookUser extends User implements Functional{
    private String displayName;
    private LocalDate birthday;

    public FacebookUser(String username, String password) {
        super(username, password);
    }

    public FacebookUser(String username, String password, String displayName, LocalDate birthday) {
        super(username, password);
        this.displayName = displayName;
        this.birthday = birthday;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                super.toString() +
                "displayName='" + displayName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public void doSomething(String param) {
        System.out.println(param+getBirthday());
    }
}
