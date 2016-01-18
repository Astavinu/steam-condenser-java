import java.util.concurrent.TimeoutException;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.servers.GoldSrcServer;
import com.github.koraktor.steamcondenser.servers.SteamPlayer;


public class demo {

	public static void main(String[] args){
		try {
			String ip = "5.9.74.118";
			int port = 2313;
			
			GoldSrcServer server = new GoldSrcServer(ip, port);
			System.out.println("Querying "+ip+":"+port);
			for(SteamPlayer p : server.getPlayers().values()){
				System.out.println(p.getName() + " : " + p.getId());
			}
		} catch (SteamCondenserException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
