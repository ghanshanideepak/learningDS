package prep.collections;

import java.util.Scanner;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(",");
        int result = 0;
        for(String i : str)
            result ^= Integer.parseInt(i.trim());
        System.out.println(result);
	}

}
