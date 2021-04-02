package solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	static class Reader {
		static BufferedReader reader;
		static StringTokenizer tokenizer;

		static void init(InputStream input) {
			reader = new BufferedReader(new InputStreamReader(input));
			tokenizer = new StringTokenizer("");
		}

		static String next() throws IOException {
			while (!tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		static int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		static double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) throws IOException {
		// Scanner input = new Scanner(System.in);
		// int t = input.nextInt();
		Reader.init(System.in);
		int t = Reader.nextInt();
		int[] arr = new int[t - 1];
		for (int i = 0; i < t - 1; i++) {
			arr[i] = Reader.nextInt();
		}
		Arrays.sort(arr);
		int k = 1;
		for (int i = 0; i < t - 1; i++) {
			if (k != arr[i]) {
				System.out.println(k);
				System.exit(0);
			}
			k++;
		}
		System.out.println(t);

	}

}
