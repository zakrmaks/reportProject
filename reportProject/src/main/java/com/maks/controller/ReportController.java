package com.maks.controller;

import com.maks.service.ReportGenerationService;
import com.maks.view.ReportView;
import org.springframework.beans.factory.annotation.Autowired;

public class ReportController {
    private ReportGenerationService reportGenerationService;
    private ReportView reportView;
@Autowired
    public ReportController(ReportGenerationService reportGenerationService, ReportView reportView) {
        this.reportGenerationService = reportGenerationService;
        this.reportView = reportView;
    }
}
