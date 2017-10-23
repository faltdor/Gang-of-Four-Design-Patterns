package com.faltdor.gof.structural.bridge.abstraction;

import com.faltdor.gof.structural.bridge.impl.IMessageSender;

public class EmailMessage extends Message {

	public EmailMessage(IMessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}

}
