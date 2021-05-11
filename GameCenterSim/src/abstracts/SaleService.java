package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SaleService {

	public void sale(Gamer gamer, Game game);
	public void campaignSale(Gamer gamer, Game game, Campaign campaign);
}
