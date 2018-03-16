
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 4;
		int m = num/2;
		int flag = 0;
		
		
		if(num ==0 || num ==1){
			System.out.println("Given number is not Prime Number");
		}else
		
		for(int i=2;i<=m;i++){
			
			if (num%i==0){
				System.out.println("Given number is not Prime Number");
		
			
			flag =1;
			break;
			}
		}
		if(flag==0){
			System.out.println("Given Number is Prime Number");
		}

	}

}
