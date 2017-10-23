package com.faltdor.gof.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import com.faltdor.gof.creational.prototype.domain.PrototypeCapableDocument;
import com.faltdor.gof.creational.prototype.domain.impl.AuthorizedSignatory;
import com.faltdor.gof.creational.prototype.domain.impl.NDAgreement;
import com.faltdor.gof.creational.prototype.domain.impl.TAndC;

public class DocumentPrototypeManager {
	private static Map<String, PrototypeCapableDocument> prototypes = 
			new HashMap<String, PrototypeCapableDocument>();

	static {
		TAndC tAndC = new TAndC();
		tAndC.setVendorName("Vendor Name Placeholder");
		
		/* Retrieve Terms and Conditions from database/network call/disk I/O here */
		tAndC.setContent("Please read and accept the terms and conditions...");
		prototypes.put("tandc", tAndC);
		
		AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
		authorizedSignatory.setName("Andrew Clark");
		authorizedSignatory.setDesignation("Operation Head");
		
		NDAgreement nda = new NDAgreement();
		nda.setVendorName("Vendor Name Placeholder");
		
		/* Retrieve Non Disclosure Agreement from database/network call/disk I/O here */
		nda.setContent("Please read and accept the NDA...");
		nda.setAuthorizedSignatory(authorizedSignatory);
		prototypes.put("nda", nda);
	}

	public static PrototypeCapableDocument getClonedDocument(final String type) {
		PrototypeCapableDocument clonedDoc = null;
		try {
			PrototypeCapableDocument doc = prototypes.get(type);
			clonedDoc = doc.cloneDocument();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedDoc;
	}
}
