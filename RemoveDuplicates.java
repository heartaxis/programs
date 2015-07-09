
public class RemoveDuplicates {
	public static void main(String[] args) {
		String data="sdsdsdwdw";
		 String data1[]=data.split("");
		 String newdata="";
		  for(int i=0;i<data1.length;i++){
	        	String temp=data1[i];
	        	if(newdata.indexOf(temp)==-1){
	        		newdata+=temp;
	        	}
	        }
		  System.out.println(newdata);
	}
}
