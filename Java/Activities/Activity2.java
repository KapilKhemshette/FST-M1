import java.util.Arrays;

public class Activity2 {
	public static void main(String[] args) {
		int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
 
        int searchNum = 10;
        int fixedSum = 30;

        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
	
	}
	public static int result(int[] num,int searchnum,int fixednum) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==searchnum) {
				sum+=num[i];
			}
			if(sum>fixednum) {
				break;
			}
		}
		
		return sum=fixednum;
	}
}
