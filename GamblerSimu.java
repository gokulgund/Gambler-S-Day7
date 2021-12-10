package com.bl.gambler;

public class GamblerSimu {

	public static int STAKE = 100;
	public static int BET = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Gambler Simulator...!");
		print();
		dayResign();
	}

	public static void print() {
		System.out.println("Gambler Have Invest $" + STAKE + " Everyday.");
		System.out.println("Gamber Bet $" + BET + " On Every Game.");
	}

	public static void dayResign() {
		while (STAKE != 50 && STAKE != 150) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if (betCheck == 1) {
				STAKE = STAKE + BET;
				System.out.println("Gambler won !");
			} else {
				STAKE = STAKE - BET;
				System.out.println("oops ! Gambler lost");
			}
			System.out.println("Stake value is: " + STAKE);
		}
		System.out.println("....Now Resign For The Day....");
	}
}