package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int number=5;
		int remainder=number%2;
		System.out.println(remainder);
	if(number==1) {
		System.out.println("Number is not prime.");
		return;
	}
		
	if(number<2) {
		System.out.println("Wrong number.");
		return;
	}
	for (int i=2;i >= number;i++) {
			if (number%i==0) {
			System.out.println("Number is not prime.");
			}
			else {
				System.out.println("Number is prime.");

			}
				
			
			
				
			
			
			
			
		}
	}

}
