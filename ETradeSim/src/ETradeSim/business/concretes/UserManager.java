package ETradeSim.business.concretes;

import java.util.List;

import ETradeSim.business.abstracts.AuthService;
import ETradeSim.business.abstracts.UserService;
import ETradeSim.business.abstracts.ValidityService;
import ETradeSim.dataAccess.abstracts.UserDao;
import ETradeSim.entities.concretes.User;

public class UserManager implements UserService{


	UserDao userDao;
	AuthService authService;
	ValidityService validityService;
	
	public UserManager(UserDao userDao, AuthService authService, ValidityService validityService) {
		this.userDao = userDao;
		this.authService = authService;
		this.validityService = validityService;
	}

	@Override
	public void register(User user) {
		if(validityService.isUsed(user.getEmail())&&
				authService.firstNameCheck(user.getFirstName())&&
				authService.lastNameCheck(user.getLastName())&&
				authService.emailCheck(user.getEmail())&&
				authService.passwordCheck(user.getPassword())) {
			userDao.register(user);
			System.out.println(user.getEmail() + " mailine do�rulama e-postas� g�nderildi. L�tfen do�rulama i�lemini yap�n�z.");
			System.out.println("Do�rulama yap�ld�.Sisteme kayd�n�z al�nd�.");
			System.out.println("---------");
		}
		
	}
	
	@Override
	public void signIn(List<User> users,String mail,String password) {
				
		for (User user : users) {
			if(user.getEmail().equals(mail) && user.getPassword().equals(password)) {
				System.out.println("Giri� Ba�ar�l� >>> " + user.getFirstName() + user.getLastName() );
				return;
			}
		}
		
		System.out.println("Giri� ba�ar�s�z. E-posta veya �ifrenizi kontrol ediniz.");
	
	}
	
}