package ETradeSim.business.abstracts;

import java.util.List;

import ETradeSim.entities.concretes.User;

public interface UserService {

	void register(User user);
	void signIn(List<User> users, String mail, String password);
}
