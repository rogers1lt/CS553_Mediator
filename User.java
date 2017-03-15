class User extends UserIF {
	
	public User(ChatMediatorIF mediator, String name){
		super(mediator, name);
	}
	
	public void send(String message){
		System.out.println(this.name + ": Sending Message:: " + message);
		mediator.send(message, this);
	}

	public void receive(String message){
		System.out.println(this.name + ": Received Message: " + message);
	}
}
