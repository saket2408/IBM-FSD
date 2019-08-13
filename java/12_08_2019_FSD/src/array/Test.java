package array;

public abstract class Test {

	public static void main(String[] args) {
		ArrayDemo array = new ArrayDemo();
		char arr[] = array.setArray(26);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n");

		int a[] = { 100, 10, -20, 30, 0 };
		a = array.sortarray(a);
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n");

		System.out.println(array.findArray(a, 100));

		array.push(1);
		array.push(2);
		array.pop();
		array.pop();
		
		//variable arguments
		System.out.println(array.add(1,2,3,4,5,6,7,8,9));

	}

}
