package com.prog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prog.entity.Employee;
import com.prog.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	
	
	@Autowired
	private EmpService service;
	
	
	@GetMapping("/")
	public String home(Model m) {
		
		List<Employee> emp=service.getAllEmp();
		m.addAttribute("emp",emp);
		
		return "index";
		
	}
	
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e, HttpSession session) {
		
		System.out.println(e);
		
		service.addEmp(e);
		session.setAttribute("msg", "Employee Added Successfully");
		return "redirect:/";
		
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		
		Employee e=service.getEmpById(id);
		
		m.addAttribute("emp",e);
		
		return "edit";
		
	}
	
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e,HttpSession session) {
		
		
		service.addEmp(e);
		session.setAttribute("msg","Emp Data Updated Successfully");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id,HttpSession session) {
		
		service.deleteEmp(id);
		session.setAttribute("msg","Emp Data Deleted Successfully");
		
		return "redirect:/";
		
	}
	
	
	 @GetMapping("/search")
	    public String searchByName(@RequestParam("name") String name, Model m) {
	        List<Employee> emp = service.findByName(name);
	        m.addAttribute("emp", emp);
	        return "index";
	    }
	

	

}
