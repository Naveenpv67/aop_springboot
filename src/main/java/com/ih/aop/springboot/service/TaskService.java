package com.ih.aop.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ih.aop.springboot.entity.Task;

@Service
public class TaskService {

    private static final List<Task> tasks = new ArrayList<>();

    public Task createTask(Task task) {
        task.setId(System.currentTimeMillis());
        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTaskById(Long id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public Task updateTask(Task task) {
        Task existingTask = getTaskById(task.getId());
        if (existingTask != null) {
            existingTask.setName(task.getName());
            existingTask.setDescription(task.getDescription());
        }
        return existingTask;
    }

    public void deleteTask(Long id) {
        Task task = getTaskById(id);
        if (task != null) {
            tasks.remove(task);
        }
    }
}
