package ETradeSim.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ETradeSim.dataAccess.abstracts.UserDao;
import ETradeSim.entities.concretes.User;

public class HibernateUserDao implements UserDao{

public List<User> users = new ArrayList<User>();
	
	
	public HibernateUserDao() {
		
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Sisteme kayıt olundu : " + user.getFirstName() +" "+ user.getLastName());
		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriş yapıldı : " + user.getFirstName() +" "+ user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}

