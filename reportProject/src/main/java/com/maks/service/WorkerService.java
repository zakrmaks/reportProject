package com.maks.service;

import com.maks.model.Worker;

import java.util.List;

public interface WorkerService {
    Worker createWorker (String firstName, String lastName);
    Worker findWorkerByFullName(String firstName, String lastName);
    List<Worker> findAll();
}
