public abstract class UserIF {
	protected ChatMediatorIF mediator;
	protected String name;
	
	public UserIF(ChatMediatorIF mediator, String name){
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String message);

	public abstract void receive(String message);
}
