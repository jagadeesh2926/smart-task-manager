package com.taskmanager.repository;

import com.taskmanager.model.Task;
import com.taskmanager.model.Task.Priority;
import com.taskmanager.model.Task.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    List<Task> findByStatus(Status status);
    
    List<Task> findByPriority(Priority priority);
    
    List<Task> findByCategory(String category);
    
    List<Task> findByTitleContainingIgnoreCase(String title);
    
    List<Task> findByOrderByDueDateAsc();
}