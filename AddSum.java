import java.util.Scanner;
import java.util.Arrays;
class AddSum {
	public static void main(String[] args) {
		 
		int sumVal=0, total=0;
		boolean test = false;
		
		Scanner myObj = new Scanner(System.in); 
		
		System.out.println("Please enter the size of the list");
		int n = myObj.nextInt();
		
		int[] list = new int[n];
		int[] t = new int[n];
		
		System.out.println("Please enter the list");
		
		for(int i=0;i<n;++i){
			list[i]= myObj.nextInt();
			if(list[i]< 0 ) {
				System.out.println("re-enter, negative numbers not allowed!");
				list[i]=myObj.nextInt();
			}
		}		
		System.out.println("Please enter the sum you want to find");
		sumVal = myObj.nextInt();
		
			int[] S = new int[n];
			
			int d = 0, tempVal = 0;
			int b, c = 0;
			for(int k = 0;k < Math.pow(2, n); ++k){
				b = k;
				for(int j = 0; j < n; ++j) {
					S[j]=0;
				}
			//	System.out.println("The subset that correspond to the rank is "+k+" : ");
				while(b > 0) {
					c = b % 2;
					b = b / 2;
					if(c == 1)
						S[d]=c;					
					++d;
			}
				d=0;
				total=0;
				for(int j = 0; j < n; ++j) {
					if(S[j] == 1) {
						total=list[j]+total;
					}
				}
			
				if(total == sumVal) {
					System.out.println("The subset that produces the sum "+sumVal+ " is : ");
					test = true;
					for(int j = 0; j < n; ++j) {
						if(S[j]==1) {
							System.out.println(list[j]);
						}
					}
				}
				if (total != sumVal) {
					if(Math.abs(tempVal - sumVal) > Math.abs(total-sumVal)) {
						tempVal = total;
						for(int j = 0; j < n; ++j)
							t[j] = S[j];
					}
				}
			}
			if(total != sumVal && !test) {
				System.out.println("Sum not possible, however the closest sum to "+sumVal+ " is : " + tempVal);	
				for(int j = 0; j < n; ++j) {
					if(S[j]==1) {
						System.out.println(list[j]);	
					}
				}
			}
	}
	
}
/* Team members are
Collett Charlton
Jerome Geddes
Anthony Shahid
Erwin Sherman
*/
