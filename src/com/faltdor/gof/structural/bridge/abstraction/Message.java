package com.faltdor.gof.structural.bridge.abstraction;

import com.faltdor.gof.structural.bridge.impl.IMessageSender;

public abstract class Message {
	IMessageSender messageSender;

	public Message(IMessageSender messageSender) {
		this.messageSender = messageSender;
	}

	abstract public void send();
}
