package com.faltdor.gof.structural.adpater.model;

public class NewLineFormatter implements ITextFormattable {
	@Override
	public String formatText(String text) {
		String formattedText = text.replace(".", "\n");
		return formattedText;
	}
}
