package com.example.ToDoApp.Config;

import com.example.ToDoApp.Model.ToDoItems;
import com.example.ToDoApp.Repositories.ToDoItemsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class ToDoItemsDataLoader implements CommandLineRunner {

    private Logger log= LoggerFactory.getLogger(ToDoItemsDataLoader.class);

    @Autowired
    ToDoItemsRepository toDoItemsRepository;
    @Override
    public void run(String... args) throws Exception {

        loadData();

    }

    private void loadData(){

        if(toDoItemsRepository.count()==0){

            ToDoItems toDoItem1= new ToDoItems("Learn Java");
            ToDoItems toDoItem2= new ToDoItems("Learn Spring Boot");

            toDoItemsRepository.save(toDoItem1);
            toDoItemsRepository.save(toDoItem2);

        }

        log.info("Data Loaded: "+toDoItemsRepository.count());
    }


}
