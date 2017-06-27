package Loads.A.Data.Arenamanager;

public class Arena {

	private final ArenaType type;
	private final Server server;
	
	private final int maxPlayers;
	private final String typeName;
	private final int teamsAmount;
	private final int maxTeamSize;
	private final World world;
	
	private ArrayList<Player> connectedPlayers = new ArrayList<>();
	
	private HashMap<Player, ArenaType.Team> playerTeam = new HashMap<>();

	protected Arena(Server server, ArenaType type) {
		this.server = server;
		this.type = type;
		
		maxPlayers = type.getMaxPlayers();
		typeName = type.getName();
		teamsAmount = type.getTeams();
		maxTeamSize = type.getMaxTeamSize();
		world = type.getWorld();
	}
	
	public boolean addPlayer(Player player) {
		connectedPlayers.put(player);
		playerTeam.put(player, ArenaType.Team.DEFAULT);
		
		player.performCommand("/server " + server.getName);
		player.teleport(type.getSpawnlocation);
	}
	
	/**
	* Starts up the arena after the server starts
	*/
	protected void startUp() {
	
	}
	
	/**
	* Shuts the arena down before server shutdown
	*/
	protected void shutDown() {
	
	}
	
	/**
	* Restarts the arena after the game is done
	*
	* @Return returns if succeeded
	*/
	public boolean restart() {
	
	}

}
