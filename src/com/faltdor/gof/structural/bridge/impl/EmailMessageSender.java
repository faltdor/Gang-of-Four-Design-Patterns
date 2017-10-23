package com.faltdor.gof.structural.bridge.impl;

public class EmailMessageSender implements IMessageSender {

	@Override
	public void sendMessage() {
		System.out.println("EmailMessageSender: Sending email message...");
	}

}
