package clientSideNetworkInterface;
import java.net.Socket;

/**
 * ServerInterface handles communications from client to the dedicated server hosting
 * this session, and will take appropriate action based on the messages it receives from
 * the server
 */
public class ServerInterface {
	
	// possible responses to requests issued to the server, caller should take appropriate action based
	// on returned value
	public enum ServerResponse{SUCCESS, CONNECTION_ERROR, NO_SUCH_SESSION, INVALID_SESSION_NAME, INSUFFICIENT_PERMISSIONS}
	
	private Socket socket;
	
	/**
	 * @param serverAddress Address of the server in dotted decimal or DNS form
	 * @param initializationPort Port of server process listening for incoming connections
	 */
	public ServerInterface(String serverAddress, int initializationPort) {
		
	}
	
	/**
	 * @return An array of strings of the names of all available sessions
	 * running on this server.
	 */
	public String[] getAvailableSessions(){
		return null;	
	}
	
	/**
	 * @param sessionName Name of the session to create
	 * @param username Public username for the user creating the session
	 * @return SUCCESS if session successfully established, INVALID_SESSION_NAME
	 * if proposed name is malformed or already in use, CONNECTION_ERROR if server
	 * could not be reached
	 */
	public ServerResponse createSession(String sessionName, String username) {
		return null;
	}
	
	/**
	 * @param sessionName Name of the session to connect to
	 * @param username Public username for the user wishing to connect
	 * @return SUCCESS if session successfully joined, NO_SUCH_SESSION
	 * if no session matches the name sessionName, CONNECTION_ERROR if server
	 * could not be reached
	 */
	public ServerResponse joinSession(String sessionName, String username) {
		return null;
	}
	
	/**
	 * If this user currently has control, update the server with any changes to
	 * the map state, then hand over control and close connection to server
	 */
	public void leaveSession() {
		
	}
	
	/**
	 * Add this process to a queue of requests at the server for edit permissions,
	 * a reply will be received granting permission only when all users ahead of this
	 * one in the queue have resigned permissions
	 */
	public void requestEditPermissions() {
		
	}
	
	/**
	 * Allow other users to edit the map state, the current user will lose editing permissions
	 */
	public void resignEditPermissions() {
		
	}
	
	/**
	 * @param message Message to be sent to other users currently in the session
	 */
	public void sendChatMessage(String message) {
		
	}
	
	/**
	 * The local map state for this user will be queried and, assuming that this user has
	 * editing permissions, will be pushed out to all other users
	 * 
	 */
	public void requestMapStatePush() {
		
	}
}
