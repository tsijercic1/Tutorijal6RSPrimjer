package ba.unsa.etf.rs.tutorijal6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new FacebookUser("abcdef", "etf222", "Shadow OF ETF", LocalDate.now());
        System.out.println(user);
        FacebookUser facebookUser = (FacebookUser) user;
        facebookUser.getUsername();
        ArrayList<Integer> integers = new ArrayList<>();


    }
}
