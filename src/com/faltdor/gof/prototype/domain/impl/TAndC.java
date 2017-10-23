package com.faltdor.gof.prototype.domain.impl;

import com.faltdor.gof.prototype.domain.PrototypeCapableDocument;

public class TAndC extends PrototypeCapableDocument {

	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
		/* Clone with shallow copy */
		TAndC tAndC = null;
		try {
			tAndC = (TAndC) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return tAndC;
	}

	@Override
	public String toString() {
		return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
	}
}