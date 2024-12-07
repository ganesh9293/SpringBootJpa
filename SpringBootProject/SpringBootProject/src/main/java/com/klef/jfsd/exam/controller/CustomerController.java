package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@Controller
public class CustomerController 
{
  @Autowired
  private CustomerService customerService;
  
  
  @GetMapping("/")
    public ModelAndView viewallcustomers()
    {
      ModelAndView mv = new ModelAndView();
      List<Customer> customerlist = customerService.ViewAllCustomers();
      mv.setViewName("viewallcustomers");
      mv.addObject("customerlist",customerlist);
      return mv;
    }
}
