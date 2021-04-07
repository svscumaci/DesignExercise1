
public class main {
	
	public static void main(String[] args) {
		homeWorkQueue<String> homeWorkList = new homeWorkQueue<String>();
		homeWorkList.add("Math");
		homeWorkList.add("Science");
		homeWorkList.add("History");
		System.out.println(homeWorkList);
		homeWorkList.removeFront();
		System.out.println(homeWorkList);
		homeWorkList.removeFront();
		System.out.println(homeWorkList);
	}

}
