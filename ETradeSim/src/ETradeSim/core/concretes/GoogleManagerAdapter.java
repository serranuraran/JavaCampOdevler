package ETradeSim.core.concretes;

import ETradeSim.core.abstracts.LoginService;
import ETradeSim.google.GoogleManager;

public class GoogleManagerAdapter implements LoginService{

	@Override
	public void loginToSystem(String message) {
		GoogleManager manager = new GoogleManager();
		manager.register(message);
		
	}

}
