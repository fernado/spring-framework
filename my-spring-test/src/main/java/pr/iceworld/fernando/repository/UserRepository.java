package pr.iceworld.fernando.repository;

import org.springframework.stereotype.Component;
import pr.iceworld.fernando.entity.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

	public List<User> getUsers() {
		List<User> list = new ArrayList<>();
		list.add(new User("AAA", "20"));
		list.add(new User("BBB", "30"));
		return list;
	}

}
