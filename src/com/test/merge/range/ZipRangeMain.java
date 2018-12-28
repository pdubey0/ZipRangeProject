package com.test.merge.range;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.test.merge.range.bo.ZipRangeBo;
import com.test.merge.range.bo.ZipRangeBoImpl;
import com.test.merge.range.model.ZipRange;

public class ZipRangeMain {

	public static void main(String[] args) {
		try {
			ZipRangeBo bo= new ZipRangeBoImpl();
			Optional<List<ZipRange>>zipRangesList=readInput();
			if(zipRangesList.isPresent()){
				List<ZipRange> consolidateList=bo.consolidateRanges(zipRangesList.get());
				writeOutput(consolidateList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static Optional<List<ZipRange>> readInput() throws Exception{
		Scanner sc=new Scanner(System.in);
		List<ZipRange> rangeList=null;
		System.out.print("Enter Input:");
		String input=sc.nextLine();
		if(input!=null && !input.equals("")){
			rangeList=Arrays.stream(input.split(" ")).map(ZipRangeUtil::convertToZipRange).collect(Collectors.toList());
		}
		else{
			sc.close();
			throw new Exception("Invalid input:input is blank or null or incorrect format.");
		}
		sc.close();
		return Optional.ofNullable(rangeList);
	}
	
	private static void writeOutput(List<ZipRange> rangeList){
		System.out.println(rangeList);
	}
}
