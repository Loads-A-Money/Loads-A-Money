package Loads.A.Money.Mechanics.PlayerMechanics;

public class PermissionMechanics {

	private static HashMap<UUID, ArrayList<Rank>> users new HashMap<UUID, ArrayList<Rank>>();

	public PermissionMechanics {
		// TODO Connect to Bukkit permission system?
	}
	
	public static void addRank(Player player, Rank rank) {
		UUID uuid = player.getUniqueID();
		
		ArrayList<Rank> ranks = null;
		
		if (users.containsKey(uuid)) {
			ranks = users.get(uuid);
		} else {
			ranks = new Arraylist<Rank>();
			ranks.add(rank);
		}
		
		users.put(uuid, ranks);
	}
	
	private static Arraylist<Rank> getAllRanksFromPlayer(Player player) {
		UUID uuid = player.getUniqueID();
		
		return users.get(uuid);
	}
	
	public static String getTag(Player player) {
		UUID uuid = player.getUniqueID();		
		ArrayList<Rank> ranks = null;
		String tag = "";
		
		if (users.containsKey(uuid)) {
			ranks = users.get(uuid);
			
			int p = 0
			
			for (Rank r : ranks) {
				if (r.getVisualPrio() > p) {
					p = r.getVisualPrio();
					tag = r.gettag();
				}
			}
			
		}
		
		return tag;
	
	}
	
	public static boolean hasPermission(Player player, Rank rank) {
		UUID uuid = player.getUniqueID();
		ArrayList<Rank> ranks = null;
		boolean hasPermission = false;
		
		if (users.containsKey(uuid)) {
			ranks = users.get(uuid);
			
			for (Rank r : ranks) {
				if (r.equals(rank) {
					hasPermission = true;
				}
			}
		}
		
		return hasPermission;
		
	}
	
	public static boolean hasMinimalPermission(Player player, Rank rank) {
		UUID uuid = player.getUniqueID();
		ArrayList<Rank> ranks = null;
		boolean hasPermission = false;
		
		if (users.containsKey(uuid)) {
			ranks = users.get(uuid);
			
			int p = 0;
			
			for (Rank r : ranks) {
				if (r.getPriority() > p {
					p = r.getPriority();
				}
			}
			
			if (p > rank.getPriority()) {
				hasPermission = true;
			}
		}
		
		return hasPermission;
	}

}
