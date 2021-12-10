package com.bl.gambler;

public class GamblerSimu {
	
	public static final int STAKE = 100;
	public static final int BET = 1;
	
	public static void print() {
		System.out.println("Gambler Have Invest $"+STAKE+" Everyday");
		System.out.println("Gamber Bet $"+BET+" On Every Game");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Gambler Simulator...!");
		print();
	}
}
