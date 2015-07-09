import java.util.Arrays;


public class FindOneOccurenceFromArray {
	public static void main(String[] args) {
		int arr[]=new int[6];
		 arr[0]=1;
		 arr[1]=2;
		 arr[2]=3;
		 arr[3]=8;
		 arr[4]=2;
		 arr[5]=1;
		 String check=Arrays.toString(arr);
		 System.out.println(check);

		 check=check.substring(1,check.length()-1).replaceAll(",", "").replaceAll(" ", "");
		
		 String data=removeDup(check);
		 String data1[]=data.split("");
		 for(int i=0;i<data1.length;i++){
        	String temp=data1[i];

        	if(findPositionsCount(check,new Integer(temp))==1){
        		System.out.println("one occurence no:"+temp);
        	}
        }
	}
	
	 public static String removeDup(String data){
		 String data1[]=data.split("");
		 String newdata="";
		  for(int i=0;i<data1.length;i++){
	        	String temp=data1[i];
	        	if(newdata.indexOf(temp)==-1){
	        		newdata+=temp;
	        	}
	        }
		  return newdata;
	 }
	 
	 public static int findPositionsCount(String num,Integer temp){
			int index = num.indexOf(temp.toString());
			int count=0;
			while(index >= 0) {
			   index = num.indexOf(temp.toString(), index+1);
			   count++;
			}
			return count;
		}
}
