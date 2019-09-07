package com.practice.programs.random;

import java.util.*;

public class Pyramid {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<List<String>> inputList = new ArrayList<>();

		for (int n = 0; n < t; n++) {
			List<String> tempList = new ArrayList<>();
			tempList.add(sc.next());
			tempList.add(sc.next());
			tempList.add(sc.next());
			inputList.add(tempList);
		}
		for (List<String> list : inputList) {
			String s = list.get(0);
			int h = Integer.parseInt(list.get(1));
			int d = Integer.parseInt(list.get(2));
			int lineLength = 1;
			int spaceLen = h - 1;
			if (d == -1) {
				lineLength = (h * 2) - 1;
				spaceLen = 0;
			}
			int cntr = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < spaceLen; j++) {
					System.out.print(" ");
				}
				StringBuilder lineData = new StringBuilder();
				for (int j = 0; j < lineLength; j++) {
					lineData.append(String.valueOf(s.charAt(cntr++)));
					if (cntr == (s.length())) {
						cntr = 0;
					}
				}
				if (i % 2 == 0) {
					System.out.println(lineData);
				} else {
					System.out.println(lineData.reverse());
				}

				if (d == 1) {
					lineLength += 2;
					spaceLen -= 1;
				} else {
					lineLength -= 2;
					spaceLen += 1;
				}
			}

		}
	}
}
