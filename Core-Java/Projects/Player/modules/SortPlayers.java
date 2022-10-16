package modules;
import java.util.Comparator;
import Player_cards.Player;

public class SortPlayers implements Comparator<Player> {

	public int compare(Player player1,Player player2) {
		return player1.getGoals()-player2.getGoals();
	}

	
}
