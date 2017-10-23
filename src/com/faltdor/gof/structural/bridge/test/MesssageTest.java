package com.faltdor.gof.structural.bridge.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.structural.bridge.abstraction.Message;
import com.faltdor.gof.structural.bridge.abstraction.TextMessage;
import com.faltdor.gof.structural.bridge.impl.EmailMessageSender;
import com.faltdor.gof.structural.bridge.impl.IMessageSender;
import com.faltdor.gof.structural.bridge.impl.TextMessageSender;

public class MesssageTest {

	@Test
	public void testSend() {
		IMessageSender textMessageSender = new TextMessageSender();
		Message textMessage = new TextMessage(textMessageSender);
		textMessage.send();

		IMessageSender emailMessageSender = new EmailMessageSender();
		Message emailMessage = new TextMessage(emailMessageSender);
		emailMessage.send();

	}

}
