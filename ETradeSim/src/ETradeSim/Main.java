package ETradeSim;

import ETradeSim.business.abstracts.UserService;
import ETradeSim.business.concretes.AuthManager;
import ETradeSim.business.concretes.UserManager;
import ETradeSim.business.concretes.ValidityManager;
import ETradeSim.dataAccess.concretes.HibernateUserDao;
import ETradeSim.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		HibernateUserDao hibernateUserDao = new HibernateUserDao();
		
		User user1 = new User(1, "Serranur", "Aran", "serranuraran12@gmail.com", "2021abc");
		User user2 = new User(2, "Berat", "Aran", "berat@gmail.com", "15689aa");
		User user3 = new User(2, "arres", "aran", "arres@gmail.com", "9876hjh");
		
		UserService userManager = new UserManager(hibernateUserDao, new AuthManager(), new ValidityManager(hibernateUserDao));
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		
		userManager.signIn(hibernateUserDao.getAll(),"serranuraran12@gmail.com","88");
		userManager.signIn(hibernateUserDao.getAll(),"serranuraran12@gmail.com","2021abc");
		
		
	}

}