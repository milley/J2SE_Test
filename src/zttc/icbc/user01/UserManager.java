package zttc.icbc.user01;

public class UserManager {
	
	User[] users;
	private int nums;
	
	public UserManager(int sz) {
		nums = 0;
		users = new User[sz];
	}

	public void add(User user) {
		if (nums >= users.length) {
			System.out.println("不能添加用户了，用户数已满！");
			return;
		}
		
		for (int i = 0; i < nums; i++) {
			if (user.getUsername().equals(users[i].getUsername())) {
				System.out.println("用户:" + user.getUsername() + " 已经存在！不能继续添加！");
				return;
			}
		}
		users[nums] = user;
		nums++;
		System.out.println(user.getNickname() + " 添加成功！");
	}
	
	public void add(int pos, User user) {
		if (nums >= users.length) {
			System.out.println("不能添加用户了，用户数已满！");
			return;
		}
		
		for (int i = 0; i < nums; i++) {
			if (user.getUsername().equals(users[i].getUsername())) {
				System.out.println("用户:" + user.getUsername() + " 已经存在！不能继续添加！");
				return;
			}
		}
		
		if (pos > nums) {
			System.out.println("添加用户位置不正确。");
			return;
		}
		
		// 添加用户
		for (int i = nums; i > pos; i--) {
			users[i] = users[i - 1];
		}
		users[pos] = user;
		nums++;
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
		// 1. 找出需要删除的user位置
		for (int i = 0; i < nums; i++) {
			if (users[i].getUsername().equals(username)) {
				pos = i;
			}
		}
		if (pos == -1) {
			System.out.println("用户 " + username + " 不存在！");
			return;
		}
		
		// 2. 将元素删除，后面元素前移
		for (int i = pos; i < nums; i++) {
			if (i == nums - 1) {
				users[i] = null;
				break;
			}
			users[i] = users[i + 1];
		}
		nums--;
	}
	
	public User load(String username) {
		for (int i = 0; i < nums; i++) {
			User u = users[i];
			if (username.equals(u.getUsername())) {
				return u;
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
		// 避免返回null元素
		System.out.println("---------list---------");
		User[] tus = new User[nums];
		for (int i = 0; i < nums; i++) {
			if (users[i] != null) {
				tus[i] = users[i];
				System.out.println(tus[i]);
			}
			
		}
		return tus;
	}
}
