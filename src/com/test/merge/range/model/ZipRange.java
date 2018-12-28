package com.test.merge.range.model;

/**
 * @author pdubey0
 * @date Dec 27, 2018
 */
public class ZipRange {

	private int min;
	private int max;
	
	public ZipRange(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(min);
		builder.append(",");
		builder.append(max);
		builder.append("]");
		return builder.toString();
	}

}
