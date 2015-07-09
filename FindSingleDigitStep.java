package comm;
// find single digit step
public class FindSingleDigitStep {

	public static void main(String[] args) {
		int data=123412;
	    int mult=1;
	    int qt=0;
	    int step=1;
	    int digits = 1 + (int)Math.floor(Math.log10(data));
	    while(digits>1){
		    while(data!=0){
		        qt=data%10;
		        mult*=qt;
		        data=data/10;

		    }
	        System.out.println("mult->"+mult);

		    data=mult;
		    mult=1;
		    digits = 1 + (int)Math.floor(Math.log10(data));
		    step++;
	    }
	    System.out.println(step);
	}
}
