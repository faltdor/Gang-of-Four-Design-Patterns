package com.faltdor.gof.structural.proxy.domain;

public interface ReportGenerator {
	void displayReportTemplate(String reportFormat,int reportEntries);
    void generateComplexReport(String reportFormat,int reportEntries);
    void generateSensitiveReport();
}
