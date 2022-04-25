package com.bridgelabz.cab.invoice.generator.util;

import java.text.DecimalFormat;

public class Util {

	static DecimalFormat df = new DecimalFormat("##.##");

	public static double formatDoubleValue(double val) {
		return Double.parseDouble(df.format(val));
	}

}