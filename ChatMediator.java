import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements ChatMediatorIF{
	
	private List<UserIF> users;
	
	public ChatMediator() {
		this.users = new ArrayList<>();
	}
	
	public void send(String message, UserIF user){
		for (UserIF u : this.users) {
			if (u != user){
				u.receive(message);
			}
		}
	}
	
	public void addUser(UserIF user){
		this.users.add(user);
	}
}
