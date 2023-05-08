package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.dao.StudentDAO;
import spring.dto.Student;

@org.springframework.stereotype.Controller
public class Controller {
//	@Autowired
//	Student student;
	@Autowired
	StudentDAO dao;

	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("student",new Student());
		mav.setViewName("saveStudent.jsp");
		return mav;
	}
	
	@RequestMapping("/addStudent")
	public ModelAndView addstudent(@ModelAttribute Student student) {
		dao.saveStudent(student);
		ModelAndView mav =new ModelAndView();
		mav.setViewName("AddStudent.jsp");
		return mav;
		
	}
	
	@RequestMapping("/viewStudent")
	public ModelAndView viewStudent() {
		List<Student> students = dao.getAllStudents();
		ModelAndView mav=new ModelAndView("ViewStudents.jsp");
		mav.addObject("stu", students);
		return mav;
		
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(@RequestParam int S_ID) {
		Student student = dao.getStudent(S_ID);
		ModelAndView mav=new ModelAndView("updateStudent.jsp");
		mav.addObject("student",student);
		return mav;
	}
	
	@RequestMapping("/updatedStudent")
	public ModelAndView up(@ModelAttribute Student student) {
		  dao.updateStudent(student);
		  ModelAndView mav=new ModelAndView("ViewStudents.jsp");
		  mav.addObject("stu",dao.getAllStudents());
		  return mav;
		
	}
	
	@RequestMapping("/DeleteStudent")
	public ModelAndView d(@RequestParam int s_id) {
		Student s = dao.getStudent(s_id);
		dao.deleteStudent(s);
		ModelAndView mav=new ModelAndView("ViewStudents.jsp");
		
		mav.addObject("stu",dao.getAllStudents());
		return mav;
	}
	
}
