package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {

			String[] fInfo = (sc.nextLine()).split(" ");

			Friend friend = new Friend(fInfo[0], fInfo[1], fInfo[2]);

			fList.add(friend);

		}

		for (Friend f : fList) {
			f.showInfo();
		}

		sc.close();
	}

}
