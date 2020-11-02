package com.maks.service;

import com.maks.model.Report;
import com.maks.model.Task;
import com.maks.model.Worker;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

public class ReportGenerationServiceImpl implements ReportGenerationService {
    private TaskService taskService;
    private WorkerService workerService;

    public ReportGenerationServiceImpl(TaskService taskService, WorkerService workerService) {
        this.taskService = taskService;
        this.workerService = workerService;
    }

    @Override
    public Report generateReport() {
        Report report = new Report();
        for(Worker worker : workerService.findAll()){
            List<Task> workerTasks = taskService.findTasksAssignedToWorker(worker);
            totalDuration(workerTasks);
            Report.ReportEntry entry = new Report.ReportEntry(worker,
                    totalDuration(workerTasks),
                    totalSalary(workerTasks));
            report.addEntry(entry);


        }
        return report;
    }

    private Duration totalDuration(List<Task> workersTasks){
        return workersTasks.stream()
                .map(task -> Duration.between(task.getStart(),task.getTo()))
                .reduce(Duration::plus)
                .orElse(Duration.ZERO);
    }
    private BigDecimal totalSalary(List<Task> workersTasks){
        return workersTasks
                .stream()
                .map(Task::getPrice)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }
}
