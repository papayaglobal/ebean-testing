package org.example.sboot.service;

import org.example.sboot.repo.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
  @Autowired
  WorkerRepository workerRepository;
}
