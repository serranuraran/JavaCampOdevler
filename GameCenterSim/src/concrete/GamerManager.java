package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public abstract class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;


	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (gamerCheckService.CheckIfRealGamer(gamer)) {
			System.out.println("Oyuncu kaydedildi" + gamer.getFirstName() + " hoşgeldiniz!");			
		} 
		
		else {
			System.out.println("Kayıt başarısız");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi-" + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi-" + gamer.getFirstName());
		
	}

}