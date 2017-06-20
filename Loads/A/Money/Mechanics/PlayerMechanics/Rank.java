package Loads.A.Money.Mechanics.Playermechanics;

public Enum Rank {
	
	// if something works for a rank, it should also work using all ranks above, via PermissionMechanics
	OWNER(999, ChatColor.AQUA + "OWNER"),
	ADMIN(900, ChatColor.PURPLE + "ADMIN"),
	GAME_MODERATOR(700, ChatColor.AQUA + "GM"),
	PLAYER_MODERATOR(400, ChatColor.AQUA + "PMOD"),
	WORLD_DEV(350, ChatColor.GREEN + "WRLD"),
	BUILDER(300, ChatColor.DARK_GREEN + "BLD"),
	SUB(100, ChatColor.GOLD + "SUB");
	
	private int priority;
	private String tag;
	
	public Rank(int priority, String tag) {
		this.priority = priority;
		this.tag = tag;
	}
	
	protected int getPriority() {
		return this.priority;
	}
	
	// Runs via PermissonMechanics
	protected String getTag() {
		return this.tag;
	}

}
