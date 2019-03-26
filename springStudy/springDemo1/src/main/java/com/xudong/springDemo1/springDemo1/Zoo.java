package com.xudong.springDemo1.springDemo1;

public class Zoo {
	private Tiger tiger;
	private Monkey monkey;

	public Tiger getTiger() {
		return tiger;
	}

	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}

	public Monkey getMonkey() {
		return monkey;
	}

	public void setMonkey(Monkey monkey) {
		this.monkey = monkey;
	}

	@Override
	public String toString() {
		return "Zoo [tiger=" + tiger + ", monkey=" + monkey + "]";
	}

}
