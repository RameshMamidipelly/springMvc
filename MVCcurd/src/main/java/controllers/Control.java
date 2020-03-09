package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import bean.Student;
import dao.EmpDao;



@Controller
public class Control {

	@Autowired
	EmpDao dao;
	
	@RequestMapping("/allStudents")
	public ModelAndView getAll(Model m) {
		List<Student> l = dao.getAllStudents();
		System.out.println(l);
		m.addAttribute("stu", l);
		System.out.println(m);
		String ss="result";
		return new ModelAndView(ss);
	}
	
	@RequestMapping("/insertpage")
	public String redre(Model m){
	Student s=new Student();
		m.addAttribute(s);
		return "insertpage";
	}
	
	@RequestMapping("/save")	
	public String addStu(@ModelAttribute("s")Student s){
		String ss=dao.save(s);
		System.out.println(ss);			
		return "redirect:/allStudents";	
	}
	@RequestMapping("/delete/{id}")
	public String delStu(@PathVariable("id")int id){
		int ss=dao.deleteStudent(id);
		System.out.println(ss);			
		return "redirect:/allStudents";	
	}
	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable("id")int id,Model m){
	Student	s=dao.getStudentId(id);
		System.out.println("detail......................"+s.getId()+" "+s.getName()+" "+s.getCourse());
		m.addAttribute(s);
		return "editform";
		}
	@RequestMapping("/searchId")
	public String editF(@RequestParam("ids")String ids,Model m){
		int id=Integer.parseInt(ids);
	Student	s=dao.getStudentId(id);
		System.out.println("detail......................"+s.getId()+" "+s.getName()+" "+s.getCourse());
		m.addAttribute("sts",s);
		return "search";
		}
	@RequestMapping("/search")
	public String seraV(){
		System.out.println("dfghjkljhgfdsfghjklkjhgfd12345678923456789");
		return "search";
		}
		
	@RequestMapping("/edited")
	public String editStu(@ModelAttribute("student")Student student){
		System.out.println("detail........st............."+student);
		String ss=dao.editStudent(student);
		System.out.println(ss);			
		return "redirect:/allStudents";		
		}

}
