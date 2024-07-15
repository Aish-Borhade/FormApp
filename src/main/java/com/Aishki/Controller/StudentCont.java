package com.Aishki.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Aishki.entity.Student;

@Controller
public class StudentCont {

	@GetMapping("/reg")
	public String loadForm() {
		
		
		
		return "loadForm";
	}
	@PostMapping("/reg")
	public String successForm(Student stu,Model model) {
		System.out.println(stu);
		model.addAttribute("name", stu.getUsername());
		return "success";
		
		
	}
	
}
