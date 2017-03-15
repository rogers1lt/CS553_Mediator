class Client{

	public static void main(String[] ignore){
		ChatMediatorIF mediator = new ChatMediator();
		
		UserIF user1 = new User(mediator, "Adam");
		UserIF user2 = new User(mediator, "Bob");
		UserIF user3 = new User(mediator, "Carol");
		UserIF user4 = new User(mediator, "Diana");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hello, world!");
	}
}
