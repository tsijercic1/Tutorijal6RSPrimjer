package ba.unsa.etf.rs.tutorijal6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new FacebookUser("abcdef", "etf222", "Shadow OF ETF", LocalDate.now());
        ArrayList<FacebookUser> facebookUsers = new ArrayList<>();
        new ArrayList<Integer>(
                Arrays.asList(1,2,3,4,5)
        )
                .stream()
                .forEach(
                        integer -> {
                            facebookUsers.add(new FacebookUser(user.getUsername(), user.getPassword(), "AAA" + integer, LocalDate.of(2020, integer, integer)));
                        }
                );
        facebookUsers.stream().forEach(facebookUser -> System.out.println("User: "+facebookUser));
    }
}
