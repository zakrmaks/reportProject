package com.maks.service;

import com.maks.model.Task;
import com.maks.model.Worker;

public interface AssignService {
    Task assignTask(Worker worker,Task task);
}
