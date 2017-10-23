package com.faltdor.gof.structural.adpater.csvadapter;

import com.faltdor.gof.structural.adpater.adaptee.ICsvFormattable;
import com.faltdor.gof.structural.adpater.model.ITextFormattable;

public class CsvAdapterImpl implements ITextFormattable {

	ICsvFormattable csvFormatter;
	
	public CsvAdapterImpl(ICsvFormattable csvFormatter) {
		this.csvFormatter = csvFormatter;
	}


	@Override
	public String formatText(String text) {
		String formattedText=csvFormatter.formatCsvText(text);
        return formattedText;
	}

}
