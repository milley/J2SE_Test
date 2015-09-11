package zttc.icbc.user02;

public class UserManager {
	
	MyList users;
	
	public UserManager(int sz) {
		users = new MyList(sz);
	}

	public void add(User user) {
		Object[] os = users.list();
		User[] us = new User[os.length];
		for (int i = 0; i < us.length; i++) {
			us[i] = (User)os[i];
		}
		
		User u = this.load(user.getUsername());
		if (u != null) {
			System.out.println("用户已存在！不能继续添加");
			return;
		}
		users.add(user);
		System.out.println(user.getNickname() + " 添加成功！");
	}
	
	public void add(int pos, User user) {
		User u = this.load(user.getUsername());
		if (u != null) {
			System.out.println("用户已存在！不能继续添加");
			return;
		}
		
		// 添加用户
		users.add(pos, user);
	}
	
	public void update(User user) {
		User u = load(user.getUsername());
		if (u == null) {
			System.out.println("要修改的用户不存在！请检查输入");
			return;
		}
		
			u.setPassword(user.getPassword());
			u.setNickname(user.getNickname());
			u.setAge(user.getAge());
	}
	
	public void delete(String username) {
		int pos = -1;
		Object[] os = users.list();
		User[] us = new User[os.length];
		for (int i = 0; i < us.length; i++) {
			us[i] = (User)os[i];
		}
		// 1. 找出需要删除的user位置
		for (int i = 0; i < us.length; i++) {
			if (us[i].getUsername().equals(username)) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			System.out.println("用户 " + username + " 不存在！");
			return;
		}
		
		// 2. 将元素删除，后面元素前移
		users.delete(pos);
	}
	
	public User load(String username) {
		Object[] os = users.list();
		User[] us = new User[os.length];
		for (int i = 0; i < us.length; i++) {
			us[i] = (User)os[i];
		}
		
		for (int i = 0; i < us.length; i++) {
			if (username.equals(us[i].getUsername())) {
				return us[i];
			}
		}
		return null;
	}
	
	public void login(String username, String password) {
		User u = load(username);
		if (u == null) {
			System.out.println("要修改的用户不存在！请检查输入");
			return;
		}
		
		if (!u.getPassword().equals(password)) {
			System.out.println("用户密码错误！");
			return;
		}
		
		System.out.println("欢迎：" + u.getNickname() + "登陆成功！");
	}
	
	public User[] list() {
		Object[] os = users.list();
		User[] us = new User[os.length];
		for (int i = 0; i < us.length; i++) {
			us[i] = (User)os[i];
		}
		return us;
	}
}
