package codeforces;

import java.io.*;
import java.util.*;

public class _4A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int w = Integer.parseInt(br.readLine());
		
		if(w > 2) {
			if(w % 2 == 0) 
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else 
			System.out.println("No");
	}
}
