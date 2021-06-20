package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요(종료:q)");

		while (true) {

			try {
				String[] gInfo = (sc.nextLine()).split(",");

				if ("q".equals(gInfo[0])) {
					System.out.println("[입력완료]");
					System.out.println("=============================");
					break;
				}

				String name = gInfo[0];
				int price = Integer.parseInt(gInfo[1]);
				int count = Integer.parseInt(gInfo[2]);

				Goods goods = new Goods(name, price, count);

				gList.add(goods);
			} catch (Exception e) {
				System.out.println("재입력 해주세요");
			}
		}

		for (Goods g : gList) {
			System.out.println(g.getName() + "(가격:" + g.getPrice() + "원)이 " + g.getCount() + "개 입고 되었습니다.");
		}

		sc.close();

	}

}
