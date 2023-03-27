package loopFor;

import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int i = 0;
		int j = 1;
		int k = 2;

		int count = 0;
		int[] number1 = { -2, 3, 0, 2, -5 };
		int lg = number1.length;
		int[] number2 = {};

		for (i = 0; i < lg; i++) {
			for (j = 1; j < lg; j++) {
				for (k = 2; k < lg; k++) {
						if (number1[j] < number1[k]) {
							if (number1[i] + number1[j] + number1[k] == 0) {
								int temp = number1[i] + number1[j] + number1[k];
								System.out.println("[i]값:" + number1[i] + "// [j]값:" + number1[j] + " /[k]값 :"+ number1[k] + " / tmp:" + temp);
								count += 1;

							}
						}
					
				}
			}
		}

		System.out.println(count);
	}

}
