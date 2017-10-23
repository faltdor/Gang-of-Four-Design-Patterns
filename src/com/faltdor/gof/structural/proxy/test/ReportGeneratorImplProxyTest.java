package com.faltdor.gof.structural.proxy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.faltdor.gof.structural.proxy.domain.ReportGenerator;
import com.faltdor.gof.structural.proxy.domain.Role;
import com.faltdor.gof.structural.proxy.proxyimpl.ReportGeneratorImplProxy;

public class ReportGeneratorImplProxyTest {

	@Test
	public void test() {
		Role accessRole = new Role();
		accessRole.setRole("Manager");
		ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
		proxy.displayReportTemplate("Pdf", 150);
		proxy.generateComplexReport("Pdf", 150);
		proxy.generateSensitiveReport();
	}

}
