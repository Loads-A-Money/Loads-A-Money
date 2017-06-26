package Loads.A.Lobby;

public class LoadsALobby extends JavaPlugin implements CommandExecutor {

	@Override
	public void onEnable() {
	
		IconMenu menu = new IconMenu("My Fancy Menu", 9, new IconMenu.OptionClickEventHandler() {
            		@Override
           		 public void onOptionClick(IconMenu.OptionClickEvent event) {
                		event.getPlayer().sendMessage("You have chosen " + event.getName());
                		event.setWillClose(true);
            		}
        	}, plugin)
        	.setOption(3, new ItemStack(Material.APPLE, 1), "Food", "The food is delicious")
        	.setOption(4, new ItemStack(Material.IRON_SWORD, 1), "Weapon", "Weapons are for awesome people")
        	.setOption(5, new ItemStack(Material.EMERALD, 1), "Money", "Money brings happiness");
	
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
