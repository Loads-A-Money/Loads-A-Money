package Loads.A.Lobby;

public class LoadsALobby extends JavaPlugin implements CommandExecutor {
	
	public static final int maxArenaSize;
	public static HashMap<Arena, Boolean> arenaMap = new HashMap<>();

	@Override
	public void onEnable() {
		
		maxArenaSize = 0; //TODO Get maxArenaSize form Bungee
		arenaMap = null; //TODO Get arenaMap from Bungee
	
		IconMenu menu = new IconMenu("My Fancy Menu", 9, new IconMenu.OptionClickEventHandler() {
            		@Override
           		 public void onOptionClick(IconMenu.OptionClickEvent event) {
                		event.getPlayer().sendMessage("You have chosen " + event.getName());
                		event.setWillClose(true);
				 
				if (event.getPosition() == 1) {
					event.getplayer(0.sendMessage("Connecting to " + "Arena 1");
					// connect player		
				}
							
				if (event.getPosition() == 2) {
					event.getplayer(0.sendMessage("Connecting to " + "Arena 2");
					// connect player		
				}
							
				if (event.getPosition() == 3) {
					event.getplayer(0.sendMessage("Connecting to " + "Arena 3");
					// connect player		
				}
            		}
        	}, plugin)
        	.setOption(1, new ItemStack(Material.WOOL(DyeColor.GREEN), 1), "Arena 1", "[THE GAME THAT IS RUNNING]")
		.setOption(2, new ItemStack(Material.WOOL(DyeColor.GREEN), 1), "Arena 2", "[THE GAME THAT IS RUNNING]")
		.setOption(3, new ItemStack(Material.WOOL(DyeColor.GREEN), 1), "Arena 3", "[THE GAME THAT IS RUNNING]")
	
	}
	
	@Override
	public void onDisable() {
	
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player player;
		
		if (sender instanceof Player) {
			player = (Player) sender;
		} else {
			sender.sendMessage("You need to be a player to issue this command");
			return false;
		}
		
		menu.open(player);
		
	}

}
