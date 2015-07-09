
public class FindTotalPosCountInStr {
	public static void main(String[] args) {
		String str="dsdsdccc";
		String find="s";
		int index = str.indexOf(find.toString());
		int count=0;
		while(index >= 0) {
		   index = str.indexOf(find, index+1);
		   count++;
		}
		System.out.println(count);
	}
}
