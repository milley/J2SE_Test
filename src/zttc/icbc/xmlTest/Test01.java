package zttc.icbc.xmlTest;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test01 {

	public static void main(String[] args) {
		URL url = Test01.class.getClassLoader().getResource("zttc/icbc/xmlTest/Books.xml");
		System.out.println(url.getPath());
		File f = new File(url.getPath());
		System.out.println(f.exists());
		
		try {
			SAXReader reader = new SAXReader();
			Document d = reader.read(f);
			
			Element re = d.getRootElement();
			System.out.println(re.getName());
			
			
			List<Element> eles = re.elements();
			for (Element ele:eles) {
				// 获取属性为id的值
				System.out.println(ele.attributeValue("id"));
				// 获取特定子节点中的元素的文本
				System.out.println(ele.elementText("title") + "--" +
						ele.elementText("author") + "--" +
						ele.elementText("price"));
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public class Book {
		private int id;
		private String title;
		private String author;
		private float price;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public Book() {
			super();
		}
		
		
	}

}
