package com.so.table;

public class Values {
	private int x;
	private int y;
	private int calc;

	public Values() {
		x = 0;
		y = 0;
		doCalc();
	}

	public Values(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCalc() {
		return calc;
	}

	public void setCalc(int calc) {
		this.calc = calc;
	}
	public void doCalc() {
		calc = x * y;
	}
}
