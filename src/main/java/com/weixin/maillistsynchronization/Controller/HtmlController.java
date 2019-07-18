package com.weixin.maillistsynchronization.Controller;

import com.example.demotest.Model.Student;
import com.example.demotest.Service.serviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HtmlController {
    @Autowired
    private serviceImp serviceImp;
    @RequestMapping(value = "/student")
    public String StudentHtml(Model model,
                              @RequestParam(value = "num", required = false) String num,
                              @RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "sex", required = false) String sex,
                              @RequestParam(value = "class", required = false) String myclass,
                              @RequestParam(value = "type", required = false) String type) {
        System.out.println(num + name + sex + myclass + type);
        List<Student> list;
        if (type != null) {
            switch (type) {
                case "query":
                    list = serviceImp.queryByNo(num);
                    model.addAttribute("students", list);
                    break;
                case "delete":

                    break;
                case "insert":

                    break;
                case "update":

                    break;
                default:
                    break;
            }
        } else {
            list = serviceImp.queryAll();
            model.addAttribute("students", list);
        }
        return "Student";
    }
    @RequestMapping(value = "/student/method")
    @ResponseBody
    public List<Student> StudentDate(@RequestParam(value = "num", required = false) String num,
                            @RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "sex", required = false) String sex,
                            @RequestParam(value = "class", required = false) String myclass,
                            @RequestParam(value = "type", required = false) String type){
        List<Student> list=new ArrayList<>();
        if (type != null) {
            switch (type) {
                case "query":
                    list = serviceImp.queryByNo(num);
                    break;
                case "delete":

                    break;
                case "insert":

                    break;
                case "update":

                    break;
                default:
                    break;
            }
        }
        return list;
    }

}
