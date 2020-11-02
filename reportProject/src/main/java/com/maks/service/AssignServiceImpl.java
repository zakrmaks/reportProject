package com.maks.service;

import com.maks.model.Task;
import com.maks.model.Worker;

public class AssignServiceImpl implements AssignService {
    TaskService taskService;

    public AssignServiceImpl(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public Task assignTask(Worker worker, Task task) {
        task.setResponsible(worker);
        return taskService.saveTask(task);
    }
}
