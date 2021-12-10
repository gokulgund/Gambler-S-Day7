package com.bl.gambler;

public class GamblerSimu {

	public static int STAKE = 100;
	public static int BET = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Gambler Simulator...!");
		print();
		forDays();
	}

	public static void print() {
		System.out.println("Gambler Have Invest $" + STAKE + " Everyday.");
		System.out.println("Gamber Bet $" + BET + " On Every Game.");
	}

	public static void forDays() {
		int Win = 0;
		int Lost = 0;
		int TotalWin = 0;
		int TotalLost = 0;
		
		for (int day = 1; day <= 20; day++) {

			while (STAKE != 50 && STAKE != 150) {
				double betCheck = Math.floor(Math.random() * 10) % 2;
				if (betCheck == 1) {
					STAKE = STAKE + BET;
				} else {
					STAKE = STAKE - BET;
				}
			}
			Win = STAKE + 100;
			Lost = STAKE - 100;
			System.out.println("Gambler Have Win The amount Today is : " + Win);
			System.out.println("Gambler Have Lost the amount today is : " + Lost);
			TotalWin = TotalWin + Win;
			TotalLost = TotalLost + Lost;
		}
		System.out.println("Gamber have win the total amount in 20 day is :" + TotalWin);
		System.out.println("Gamber have lost the total amount in 20 day is :" + TotalLost);
	}
}