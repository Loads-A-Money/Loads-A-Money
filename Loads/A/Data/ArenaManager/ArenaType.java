package Loads.A.Data.ArenaManager;

public enum ArenaType {

	DEFAULT(2, "Deault", 0, 0, null),
	TEST(8, "Test", 2, 4, null);
	
	private final int maxPlayers;
	private final String name;
	private final int teams;
	private final int maxTeamSize;
	private final World world;
	
	public ArenaType(int maxPlayers, String name, int teams, int maxTeamSize, World world) {
		this.maxPlayers = maxPlayers;
		this.name = name;
		this.teams = teams;
		this.maxTeamSize = maxTeamSize;
		this.world = world;
	}

}
