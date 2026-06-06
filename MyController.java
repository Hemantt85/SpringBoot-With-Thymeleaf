package in.sp.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{
	@GetMapping("/openProfile")
	public String openProfilePage(Model model)
	{
		String name = "Satyarth Pratap Singh";
		model.addAttribute("modelName", name);
		return "profile";
	}
	
	@GetMapping("/openConditional")
	public String openConditionalPage(Model model)
	{
		int no1=10;
		int no2=20;
		model.addAttribute("number1", no1);
		model.addAttribute("number2", no2);
		return "conditional";
		}
	
	@GetMapping("/openLooping")
	
		public String openLoopingPage(Model model)
		{
			List<Integer> number = List.of(10,20,30,40,50);
			model.addAttribute("modelNumber", number);
			return "looping";
		}
	}