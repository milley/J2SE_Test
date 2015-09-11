package zttc.icbc.user02;

public class Test {
	public static void main(String[] args) {
		UserManager um = new UserManager(3);
//		User u = new User("lgd", "123", "ÀÏÊó", 20);
//		System.out.println(u.getUsername());
		
		um.add(new User("lgd", "123", "ÀÏÊó", 20));
		um.add(new User("lgd", "123", "ÀÏÊó", 20));
		um.add(new User("ldd", "123", "ÁúµÜµÜ", 21));
		um.add(new User("we", "123", "2009", 20));
		um.add(new User("s", "123", "´óS", 20));
	
		User u = um.load("lgd");
		System.out.println(u);
		
		User u1 = new User("ldd", "222", "ÁúµÜµÜ", 25);
		um.update(u1);
		System.out.println(u1);
		
		um.login("ldd", "123");
		um.login("lddx", "123");
		um.login("ldd", "222");
		
		um.list();
		
//		um.delete("lgd");
//		um.delete("ldd");
		um.delete("we");
		
		um.list();
		um.add(0, new User("we", "123", "2009", 20));
		um.list();
	}
}
