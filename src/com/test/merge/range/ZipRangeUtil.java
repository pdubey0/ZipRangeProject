package com.test.merge.range;

import com.test.merge.range.model.ZipRange;

public class ZipRangeUtil {
	
	public static ZipRange convertToZipRange(String rangeStr) {
		String[] rangeStrs = rangeStr.substring(1, rangeStr.length()-1).split(",");
		return new ZipRange(Integer.parseInt(rangeStrs[0]), Integer.parseInt(rangeStrs[1]));
	}

}
