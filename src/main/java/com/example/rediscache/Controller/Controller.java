package com.example.rediscache.Controller;


import com.example.rediscache.Model.Student;
import com.example.rediscache.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceClass serviceClass;

    @RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") int id) throws Exception{
        try {
            return serviceClass.getStudent(id);
        }catch (Exception c) {
            System.out.println(c.getMessage());
            return  null;
        }
    }
}
