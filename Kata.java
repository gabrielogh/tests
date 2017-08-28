public class Kata{

	public static Boolean multiple_of_five(int n){
		return (n%5) == 0;
	}

	public static Boolean multiple_of_three(int n){
		return (n%3) == 0;
	}

	public static void calculate(int n){
		for(int i=0; i<n; i++){

			if(multiple_of_three(i)){
				if(multiple_of_five(i)){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println("Fizz");
				}
			}
			else if(multiple_of_five(i)){
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