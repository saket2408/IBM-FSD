package array;

import java.util.*;

public class ArrayDemo {
	private char arr[];
	private int[] stk = new int[5];
	private static int index = 0;

	public ArrayDemo() {

	}

	public char[] setArray(int length) {
		arr = new char[length];
		for (int i = 0; i < length; i++) {
			arr[i] = (char) ('a' + i);
		}
		return arr;
	}

	public int[] sortarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		return a;
	}

	public boolean findArray(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return true;
			}
		}
		return false;
	}

	public void push(int a) {
		if (index == stk.length) {
			System.out.println("overflow");
		} else {
			stk[index] = a;
			index++;
			System.out.println("push result:");
			for (int i = 0; i < index; i++) {
				System.out.print(stk[i] + "  ");
			}
			System.out.println("\n");
		}
	}

	public void pop() {
		index--;
		if (index == -1) {
			System.out.println("under flow");
		} else {
			System.out.println("pop result:");
			stk[index] = 0;
			for (int i = 0; i < index; i++) {
				System.out.print(stk[i] + "  ");
			}
			System.out.println("\n");

		}
	}
	
	//variable arguments
	public int add(int... var) {
		int result = 0;
		for(int i: var) {
			result = result + i;
		}
		return result;
	}
}
