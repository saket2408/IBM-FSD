package error_exeption;

public class AddArgs {

	public static void main(String[] args) {
		int sum = 0;
		for(String i:args) {
			try {
			sum += Integer.parseInt(i);
			System.out.println(args[10]);
			}
			catch (NumberFormatException nfe) {
				System.err.println("number format exception occured");
				System.exit(0);
			}
			catch (ArrayIndexOutOfBoundsException aiob) {
				System.err.println("array index out of bound exception occured");
				System.exit(0);
			}
			catch (Exception e) {
				System.err.println("exception occured");
				System.exit(0);
			}
			finally {
				System.out.println("finally block");
			}
		}
		System.out.println("sum is: "+sum);

	}

}
