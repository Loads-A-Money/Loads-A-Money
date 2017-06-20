package Loads.A.Money.Mechanics.Playermechanics;

public Enum Rank {
	
	OWNER(999, ChatColor.AQUA + "OWNER", 7),
	ADMIN(900, ChatColor.PURPLE + "ADMIN", 6),
	GAME_MODERATOR(700, ChatColor.AQUA + "GM", 5),
	PLAYER_MODERATOR(400, ChatColor.AQUA + "PMOD", 3),
	WORLD_DEV(350, ChatColor.GREEN + "WRLD", 4),
	BUILDER(300, ChatColor.DARK_GREEN + "BLD", 2),
	SUB(100, ChatColor.GOLD + "SUB", 1);
	
	private int priority;
	private String tag;
	private int visualPrio;
	
	public Rank(int priority, String tag, int visualPrio) {
		this.priority = priority;
		this.tag = tag;
		this.visualPrio = visualPrio;
	}
	
	protected int getPriority() {
		return this.priority;
	}
	
	// Runs via PermissonMechanics
	protected String getTag() {
		return this.tag;
	}
	
	protected String getVisualprio() {
		return this.visualPrio;
	}

}
