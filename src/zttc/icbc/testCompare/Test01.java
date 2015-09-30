package zttc.icbc.testCompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test01 {

	public static void main(String[] args) {
		List<Song> songs = new ArrayList<Song>();
		songs.add(new Song(22, "刘东明", "我是一个有钱人"));
		songs.add(new Song(12, "周杰伦", "黑色毛衣"));
		songs.add(new Song(3, "周华健", "花心"));
		songs.add(new Song(29, "刘东明", "入党申请书"));
		songs.add(new Song(17, "周华健", "朋友"));
		songs.add(new Song(33, "周华健", "寡妇村传奇"));
		songs.add(new Song(1, "周杰伦", "稻香"));
		songs.add(new Song(99, "李宗盛", "一个人"));
		songs.add(new Song(88, "李宗盛", "山丘"));
		songs.add(new Song(22, "张震岳", "再见"));
		
		// 使用类Song里的CompareTo进行比较
//		Collections.sort(songs);
		
		// 使用Comparator新实现的类来比较
//		Collections.sort(songs, new SongIdCompare());
//		Collections.sort(songs, new SongNameCompare());
		Collections.sort(songs, new SongSongerCompare());
		
		printList(songs);
	}
	
	public static void printList(Collection<Song> c) {
		for (Song str:c) {
			System.out.println(str);
		}
	}

}




class Song implements Comparable<Song>{
	private int id;
	private String name;
	private String songer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSonger() {
		return songer;
	}
	public void setSonger(String songer) {
		this.songer = songer;
	}
	public Song(int id, String songer, String name) {
		super();
		this.id = id;
		this.name = name;
		this.songer = songer;
	}
	public Song() {
		super();
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", songer=" + songer + "]";
	}
	@Override
	public int compareTo(Song o) {
		// 1. compare with id
//		if (this.getId() > o.getId()) return 1;
//		else if (this.getId() < o.getId()) return -1;
//		else return 0;
		
		// 2. compare with name
//		return this.getName().compareTo(o.getName());
		
		// 3. compare with songer
		return this.getSonger().compareTo(o.getSonger());
	}
}

class SongNameCompare implements Comparator<Song> {
	public int compare(Song o1, Song o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class SongSongerCompare implements Comparator<Song> {
	public int compare(Song o1, Song o2) {
		return o1.getSonger().compareTo(o2.getSonger());
	}
}

class SongIdCompare implements Comparator<Song> {
	public int compare(Song o1, Song o2) {
		return o1.getId() > o2.getId() ? 1 : (o1.getId() < o2.getId() ? -1 : 0);
	}
}