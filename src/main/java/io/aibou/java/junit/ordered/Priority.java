package io.aibou.java.junit.ordered;

/**
 * Created by aibou on 2014/01/22.
 */
public enum Priority {
	HIGH(128),
	NORMAL(64),
	LOW(32);

	private Priority(int priorityNumber) {
		this.priorityNumber = priorityNumber;
	}

	private int priorityNumber;

	public int getPriorityNumber() {
		return this.priorityNumber;
	}
}
