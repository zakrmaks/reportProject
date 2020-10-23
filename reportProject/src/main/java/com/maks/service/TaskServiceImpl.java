package com.maks.service;

import com.maks.model.Task;
import com.maks.model.Worker;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Override
    public Task createTask(String description, LocalDateTime from, LocalDateTime to, BigDecimal price) {
        return null;
    }

    @Override
    public Task saveTask(Task task) {
        return null;
    }

    @Override
    public List<Task> findAllTasks() {
        return null;
    }

    @Override
    public List<Task> findTasksAssignedToWorker(Worker worker) {
        return null;
    }
}
