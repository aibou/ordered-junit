package io.aibou.java.junit.ordered;

/**
 * Created by A13167 on 2014/01/22.
 */
public enum Priority {
	HIGH(64),
	NORMAL(0),
	LOW(-64);

	private Priority(int priorityNumber) {
		this.priorityNumber = priorityNumber;
	}

	private int priorityNumber;

	public int getPriorityNumber() {
		return this.priorityNumber;
	}
}
