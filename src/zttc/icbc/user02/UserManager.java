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
			System.out.println("�û��Ѵ��ڣ����ܼ������");
			return;
		}
		users.add(user);
		System.out.println(user.getNickname() + " ��ӳɹ���");
	}
	
	public void add(int pos, User user) {
		User u = this.load(user.getUsername());
		if (u != null) {
			System.out.println("�û��Ѵ��ڣ����ܼ������");
			return;
		}
		
		// ����û�
		users.add(pos, user);
	}
	
	public void update(User user) {
		User u = load(user.getUsername());
		if (u == null) {
			System.out.println("Ҫ�޸ĵ��û������ڣ���������");
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
		// 1. �ҳ���Ҫɾ����userλ��
		for (int i = 0; i < us.length; i++) {
			if (us[i].getUsername().equals(username)) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			System.out.println("�û� " + username + " �����ڣ�");
			return;
		}
		
		// 2. ��Ԫ��ɾ��������Ԫ��ǰ��
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
			System.out.println("Ҫ�޸ĵ��û������ڣ���������");
			return;
		}
		
		if (!u.getPassword().equals(password)) {
			System.out.println("�û��������");
			return;
		}
		
		System.out.println("��ӭ��" + u.getNickname() + "��½�ɹ���");
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
