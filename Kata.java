public class Kata{

	private Boolean multiple_of_five(int n){
		return (n%5) == 0;
	}

	private Boolean multiple_of_three(int n){
		return (n%3) == 0;
	}

	private void calculate(int n){
		for(int i=0; i<n; i++){

			if(multiple_of_three(n)){
				if(multiple_of_five(n)){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println("Fizz");
				}
			}
			else if(multiple_of_five(n)){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args){
		calculate(100);
	}
	
}