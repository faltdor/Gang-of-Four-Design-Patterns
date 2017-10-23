package com.faltdor.gof.creational.prototypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.creational.prototype.DocumentPrototypeManager;
import com.faltdor.gof.creational.prototype.domain.PrototypeCapableDocument;

public class DocumentPrototypeManagerTest {

	@Test
	public void testGetClonedDocument() throws Exception {
		PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
		clonedTAndC.setVendorName("Mary Parker");
		System.out.println(clonedTAndC);
		assertNotNull(clonedTAndC);
		
		
		PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
		clonedNDA.setVendorName("Patrick Smith");
		System.out.println(clonedNDA);
		
		assertNotNull(clonedNDA);
	}

}
