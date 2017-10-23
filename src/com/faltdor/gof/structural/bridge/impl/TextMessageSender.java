package com.faltdor.gof.structural.bridge.impl;

public class TextMessageSender implements IMessageSender {

	@Override
	public void sendMessage() {
		 System.out.println("TextMessageSender: Sending text message...");
	}

}
