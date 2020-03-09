package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Person;

@Controller
public class Controllerss {
	@RequestMapping("/result")
	public ModelAndView display(@ModelAttribute("st") Person st) {
		Map<String, String> m = new HashMap<String, String>();
		ModelMap mp = new ModelMap();
		m.put("msg", "ramesh");
		mp.addAttribute(st);
		mp.addAllAttributes(m);
		return new ModelAndView("result", mp);
	}

	@RequestMapping("/listj")
	public ModelAndView display(Model m) {
		List<Person> l = Arrays.asList(new Person("ramesh", 123, "mca"), new Person("ram", 102, "mba"),
				new Person("rammi", 235, "msc"));
		m.addAttribute("person",l);
		System.out.println(l);
		System.out.println(m);
		return new ModelAndView("listj");
	}
	
	@RequestMapping("/li")
	public ModelAndView displays(Model m) {
		List l=new ArrayList();
		l.add("ramesh");
		l.add("rammi");
		l.add("ram");
		l.add("pav");
		List l1=new ArrayList();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		m.addAttribute("person",l);
		m.addAttribute("pro",l1);
		System.out.println(l);
		System.out.println(m);
		List l2=new ArrayList();
		l2.addAll(l1);
		l2.addAll(l);
		m.addAttribute("all",l2);
		
		return new ModelAndView("listj");
	}
	
	
	

}
