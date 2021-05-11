import java.time.LocalDate;

import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
public class Main {

	public static void main(String[] args) {
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1, "Valorant", 150));
		

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Bahar Sonu Kampanyaları", "Bütün oyunlar yarı fiyatına!", 50));
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(new Gamer(1, "Serranur", "Aran", LocalDate.of(2002, 03, 03), "85569477235"), new Game(1, "Valorant", 150));
		saleManager.campaignSale(
				new Gamer(1, "Serranur", "Aran", LocalDate.of(2002, 03, 03), "85569477235"),
				new Game(1, "Valorant", 150), 
				new Campaign(1, "Bahar Sonu Kampanyaları", "Bütün oyunlar yarı fiyatına!", 50)
				);

	}

}
