package com.faltdor.gof.structural.bridge.abstraction;

import com.faltdor.gof.structural.bridge.impl.IMessageSender;

public class TextMessage extends Message {
	
	public TextMessage(IMessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
      messageSender.sendMessage();
    }
}
