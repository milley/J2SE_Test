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
			System.out.println("��������û��ˣ��û���������");
			return;
		}
		
		for (int i = 0; i < nums; i++) {
			if (user.getUsername().equals(users[i].getUsername())) {
				System.out.println("�û�:" + user.getUsername() + " �Ѿ����ڣ����ܼ�����ӣ�");
				return;
			}
		}
		users[nums] = user;
		nums++;
		System.out.println(user.getNickname() + " ��ӳɹ���");
	}
	
	public void add(int pos, User user) {
		if (nums >= users.length) {
			System.out.println("��������û��ˣ��û���������");
			return;
		}
		
		for (int i = 0; i < nums; i++) {
			if (user.getUsername().equals(users[i].getUsername())) {
				System.out.println("�û�:" + user.getUsername() + " �Ѿ����ڣ����ܼ�����ӣ�");
				return;
			}
		}
		
		if (pos > nums) {
			System.out.println("����û�λ�ò���ȷ��");
			return;
		}
		
		// ����û�
		for (int i = nums; i > pos; i--) {
			users[i] = users[i - 1];
		}
		users[pos] = user;
		nums++;
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
		// 1. �ҳ���Ҫɾ����userλ��
		for (int i = 0; i < nums; i++) {
			if (users[i].getUsername().equals(username)) {
				pos = i;
			}
		}
		if (pos == -1) {
			System.out.println("�û� " + username + " �����ڣ�");
			return;
		}
		
		// 2. ��Ԫ��ɾ��������Ԫ��ǰ��
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
		// ���ⷵ��nullԪ��
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
