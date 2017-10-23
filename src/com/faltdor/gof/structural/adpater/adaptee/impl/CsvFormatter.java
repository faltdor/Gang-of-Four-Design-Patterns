package com.faltdor.gof.structural.adpater.adaptee.impl;

import com.faltdor.gof.structural.adpater.adaptee.ICsvFormattable;

public class CsvFormatter implements ICsvFormattable {

	@Override
	public String formatCsvText(String text) {
		String formattedText = text.replace(".", ",");
		return formattedText;
	}

}
