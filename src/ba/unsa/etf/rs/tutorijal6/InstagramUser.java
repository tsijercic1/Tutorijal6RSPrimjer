package ba.unsa.etf.rs.tutorijal6;

public class InstagramUser extends User implements Interface{
    private String page;
    private Integer numberOfFollowers;


    public InstagramUser(String username, String password) {
        super(username, password);
    }

    public InstagramUser(String username, String password, String page, Integer numberOfFollowers) {
        super(username, password);
        this.page = page;
        this.numberOfFollowers = numberOfFollowers;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Integer getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(Integer numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

}
