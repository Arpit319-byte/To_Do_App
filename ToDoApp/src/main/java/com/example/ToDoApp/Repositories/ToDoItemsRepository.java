package com.example.ToDoApp.Repositories;

import com.example.ToDoApp.Model.ToDoItems;
import org.springframework.data.repository.CrudRepository;

public interface ToDoItemsRepository extends CrudRepository<ToDoItems, Long> {

}
