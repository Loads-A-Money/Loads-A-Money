package Loads.A.Data.Arenamanager;

public class ArenaManager {

	private static final int maxArenaSize;
	private static final Server[] connectedServers;
	private static final int maxArenaForServer;
	private static final int serverSize;
	
	// Arena, online
	private static HashMap<Arena, Boolean> arenaMap = new HashMap<>();
	// Server, arenas connected
	private staitc HashMap<Server, Integer> serverMap = new hashMap<>();

	public ArenaManager(int arenaSize, Server... servers, int maxArena) {
		maxArenaSize = arenaSize;
		connectedServers = servers;
		maxArenaForServer = maxArena;
		serverSize = servers.length();
		
		for (Server s : connectedServers) {
			servermap.put(s, 0);
		}
	}
	
	public Server createArena(ArenaType type) {
		
		Arena arena;
		
		for (int i = 0; i = serverSize; i++) {
			Server s = connectedServers[i];
			
			int connected = serverMap.get(s);
			
			if (s != maxArenaForServer) {
				serverMap.put(s, connected++);
				
				arena = new Arena(server, type);
				
				break;
			}
		}
		
		if (arena != null) arenaMap.put(arena, false);	
		
	}
	
	public void startupArena(Arena arena) {
		arenaMap.put(arena, true);
		arena.startUp();
	}
	
	public void shutdownArena(Arena arena) {
		arenaMap.put(arena, false);
		arena.shutdown();
	}

}
