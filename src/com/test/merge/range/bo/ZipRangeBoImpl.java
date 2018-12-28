package com.test.merge.range.bo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

import com.test.merge.range.model.ZipRange;

/**
 * @author pdubey0
 * @date Dec 27, 2018
 */
public class ZipRangeBoImpl implements ZipRangeBo {
	@Override
	public List<ZipRange> consolidateRanges(List<ZipRange> zipRanges) {
		Stack<ZipRange> rangeStack = new Stack<>();
		zipRanges.stream().sorted(Comparator.comparing(ZipRange::getMin)).forEach(range -> {
			if (!rangeStack.isEmpty()) {
				if (rangeStack.peek().getMax() >= range.getMin()) {
					ZipRange tempRange = rangeStack.pop();
					tempRange.setMax(Math.max(range.getMax(), tempRange.getMax()));
					rangeStack.push(tempRange);
				} else {
					rangeStack.push(range);
				}

			} else {
				rangeStack.push(range);
			}
		});

		return new ArrayList<ZipRange>(rangeStack);
	}
}
