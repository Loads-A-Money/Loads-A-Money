package Loads.A.Data.ArenaManager;

public enum ArenaType {

	DEFAULT(2, "Deault", 0, 0, null, new Location(world, 0, 0, 0),
	TEST(8, "Test", 2, 4, null, null);
	
	private final int maxPlayers;
	private final String name;
	private final int teams;
	private final int maxTeamSize;
	private final World world;
	private final Location spawnLocation;
	
	public ArenaType(int maxPlayers, String name, int teams, int maxTeamSize, World world, Location spawnLocation) {
		this.maxPlayers = maxPlayers;
		this.name = name;
		this.teams = teams;
		this.maxTeamSize = maxTeamSize;
		this.world = world;
		this.location = location;
	}
	
	public int getMaxPlayers() { return this.maxPlayers }
	public string getName() { return this.name }
	public int getTeams() { return this.teams }
	public int getMaxTeamSize() { return this.maxTeamSize }
	public World getWorld() { return this.world }
	public Location getSpawnLocation() { return this.spawnLocation }
	
	enum Team {
		
		DEFAULT(0), 
		BLUE(1), 
		RED(2), 
		YELLOW(3), 
		GREEN(4);
		
		private final int priority;
		
		public Team(int priority) {
			this.priority = priority;
		}
	}

}
