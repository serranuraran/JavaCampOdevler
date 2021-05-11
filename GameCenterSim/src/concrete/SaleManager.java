package concrete;


import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService {


	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+ game.getGameName() + " oyununu " + 
				campaign.getName() + " ile %" + campaign.getDiscount() + " indirim ile " + game.getUnitPrice()/2 + " TL'den satın aldı");		
	}

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + game.getGameName() + " oyununu " + game.getUnitPrice() + " TL'den satın aldı");
		
	}


}