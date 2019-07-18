package com.weixin.maillistsynchronization.Controller;

import com.example.demotest.Model.Student;
import com.example.demotest.Service.serviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    private serviceImp serviceImp;
    @PostMapping("/save")
    public int save (Student student) {
        int save = serviceImp.save(student);
        return save;
    }
    @GetMapping("/delete/{id}")
    public String delete (@PathVariable Integer id) {
        try {
            serviceImp.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "删除成功！";
    }
    @PutMapping("/update")
    public int update (Student student) {
        int update = serviceImp.update(student);
        return update;
    }
    @GetMapping("/queryAll")
    public List<Student> queryAll() {
        List<Student> students = serviceImp.queryAll();
        return students;
    }

    @GetMapping("/query/{id}")
    public Student queryById(@PathVariable Integer id) {
        Student student = serviceImp.queryById(id);
        return student;
    }
}
