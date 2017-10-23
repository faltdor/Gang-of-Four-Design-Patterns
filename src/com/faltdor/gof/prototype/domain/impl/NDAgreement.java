package com.faltdor.gof.prototype.domain.impl;

import com.faltdor.gof.prototype.domain.PrototypeCapableDocument;

public class NDAgreement extends PrototypeCapableDocument {

	private AuthorizedSignatory authorizedSignatory;

	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
		/* Clone with deep copy */
		NDAgreement nda;
		nda = (NDAgreement) super.clone();

		AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();

		nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
		return nda;
	}

	@Override
	public String toString() {
		return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent()
				+ ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
	}

	public AuthorizedSignatory getAuthorizedSignatory() {
		return authorizedSignatory;
	}

	public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
		this.authorizedSignatory = authorizedSignatory;
	}

}
