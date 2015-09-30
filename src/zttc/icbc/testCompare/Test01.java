package zttc.icbc.testCompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test01 {

	public static void main(String[] args) {
		List<Song> songs = new ArrayList<Song>();
		songs.add(new Song(22, "������", "����һ����Ǯ��"));
		songs.add(new Song(12, "�ܽ���", "��ɫë��"));
		songs.add(new Song(3, "�ܻ���", "����"));
		songs.add(new Song(29, "������", "�뵳������"));
		songs.add(new Song(17, "�ܻ���", "����"));
		songs.add(new Song(33, "�ܻ���", "�Ѹ��崫��"));
		songs.add(new Song(1, "�ܽ���", "����"));
		songs.add(new Song(99, "����ʢ", "һ����"));
		songs.add(new Song(88, "����ʢ", "ɽ��"));
		songs.add(new Song(22, "������", "�ټ�"));
		
		// ʹ����Song���CompareTo���бȽ�
//		Collections.sort(songs);
		
		// ʹ��Comparator��ʵ�ֵ������Ƚ�
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