package com.xdkj.controller;

import com.xdkj.bean.Emp;
import com.xdkj.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author guo
 * @create 2019-12-06 10:57
 */
@Controller
public class EmpController {

    @Autowired
    private EmpMapper em;


    @RequestMapping("showEmp")
    public String showEmp(Model model){

        List<Emp> emps = em.selectByAll(null);

        model.addAttribute("empList",emps);


        return "showEmp";
    }
}
