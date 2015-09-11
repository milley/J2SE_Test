package zttc.icbc.user02;

public class MyList {
	Object[] objs;
	private int nums;
	
	public MyList(int sz) {
		nums = 0;
		objs = new Object[sz];
	}

	public void add(Object object) {
		if (nums >= objs.length) {
			return;
		}
		
		objs[nums] = object;
		nums++;
	}
	
	public void add(int pos, Object object) {
		if (nums >= objs.length) {
			System.out.println("不能添加用户了，用户数已满！");
			return;
		}
		
		if (pos > nums) {
			System.out.println("添加用户位置不正确。");
			return;
		}
		
		// 添加用户
		for (int i = nums; i > pos; i--) {
			objs[i] = objs[i - 1];
		}
		objs[pos] = object;
		nums++;
	}
	
	public void delete(int pos) {
		// 2. 将元素删除，后面元素前移
		for (int i = pos; i < nums; i++) {
			if (i == nums - 1) {
				objs[i] = null;
				break;
			}
			objs[i] = objs[i + 1];
		}
		nums--;
	}
	
	public Object[] list() {
		Object[] tus = new Object[nums];
		for (int i = 0; i < nums; i++) {
			tus[i] = objs[i];
		}
		return tus;
	}
}
