package com.faltdor.gof.structural.adpater;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.structural.adpater.adaptee.ICsvFormattable;
import com.faltdor.gof.structural.adpater.adaptee.impl.CsvFormatter;
import com.faltdor.gof.structural.adpater.csvadapter.CsvAdapterImpl;
import com.faltdor.gof.structural.adpater.model.ITextFormattable;
import com.faltdor.gof.structural.adpater.model.NewLineFormatter;

public class NewLineFormatterTest {

	@Test
	public void testFormatText() {
		String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
        ITextFormattable newLineFormatter=new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);
        assertNotNull(resultString);

        ICsvFormattable csvFormatter=new CsvFormatter();
        ITextFormattable csvAdapter=new CsvAdapterImpl(csvFormatter);
        String resultCsvString=csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
        assertNotNull(resultCsvString);
	}

}
