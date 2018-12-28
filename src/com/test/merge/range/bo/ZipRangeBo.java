package com.test.merge.range.bo;

import java.util.List;

import com.test.merge.range.model.ZipRange;
/**
 * @author pdubey0
 * @date Dec 27, 2018
 */
public interface ZipRangeBo {
	List<ZipRange> consolidateRanges(List<ZipRange> zipRanges);
}
