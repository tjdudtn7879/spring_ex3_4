package com.lgy.springex_3_4;

public class MyWon2Dollar {
	int won;
	Won2Dollar won2Dollar;
	
	public void exch() {
		won2Dollar.exchange(won);
	}
	
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public Won2Dollar getWon2Dollar() {
		return won2Dollar;
	}
	public void setWon2Dollar(Won2Dollar won2Dollar) {
		this.won2Dollar = won2Dollar;
	}
	
}
