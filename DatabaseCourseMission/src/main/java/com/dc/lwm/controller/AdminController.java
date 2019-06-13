package com.dc.lwm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dc.lwm.entity.Class;
import com.dc.lwm.entity.Course;
import com.dc.lwm.entity.Major;
import com.dc.lwm.entity.Student;
import com.dc.lwm.entity.StudentInfoView;
import com.dc.lwm.entity.Teacher;
import com.dc.lwm.entity.TeacherInfoView;
import com.dc.lwm.entity.User;
import com.dc.lwm.service.ClassService;
import com.dc.lwm.service.CourseService;
import com.dc.lwm.service.MajorService;
import com.dc.lwm.service.StudentInfoViewService;
import com.dc.lwm.service.StudentService;
import com.dc.lwm.service.TeacherInfoViewService;
import com.dc.lwm.service.TeacherService;
import com.dc.lwm.service.UserService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private UserService userService;
	@Autowired
	private TeacherInfoViewService teacherInfoViewService;
	@Autowired
	private StudentInfoViewService studentInfoViewService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private ClassService classService;
	@Autowired
	private MajorService majorService;

	/*
	 * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<ѧ������>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	 * >>> >>>>
	 */
	@RequestMapping(value = "studentlist")
	public String studentlist(Model model) {
		List<StudentInfoView> list = studentInfoViewService.getAll();
		model.addAttribute("list", list);
		return "/admin/studentlist";
	}

	@RequestMapping(value = "/addStudent", method = { RequestMethod.GET })
	public String addStudentUI(Model model) {
		List<Class> list = classService.getAllClass();
		model.addAttribute("Majorlist", list);
		return "/admin/addstudent";
	}

	@RequestMapping(value = "/addStudent", method = { RequestMethod.POST })
	public String addStudent(Student student) {
		int a = studentService.addStudent(student);
		if (a == 0)
			return "error";
		return "redirect:/admin/studentlist";
	}

	@RequestMapping(value = "/editStudent", method = { RequestMethod.GET })
	public String editStudentUI(Long stuId, Model model) {
		if (stuId == 0)
			return "redirect:/admin/studentlist";
		Student student = studentService.getById(stuId);
		List<Class> list = classService.getAllClass();
		List<Major> list2 = majorService.getAllMajor();
		model.addAttribute("list", list);
		model.addAttribute("list1", list2);
		model.addAttribute("student", student);
		return "/admin/editstudent";
	}

	@RequestMapping(value = "/editStudent", method = { RequestMethod.POST })
	public String editStudent(Student student) {
		studentService.updateById(student);
		return "redirect:/admin/studentlist";
	}

	@RequestMapping(value = "/removeStudent", method = { RequestMethod.GET })
	private String removeStudent(Long stuId) {
		studentService.fireStudent(stuId);
		return "redirect:/admin/studentlist";
	}

	@RequestMapping(value = "selectStudent", method = { RequestMethod.POST })
	private String selectStudent(String findByName, Model model) {
		long stuId = Long.parseLong(findByName);
		model.addAttribute("student", studentService.getById(stuId));
		return "/admin/studentlist";
	}

	/*
	 * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<��ʦ����>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	 * >>> >>>>
	 */
	@RequestMapping(value = "teacherlist")
	public String teacherlist(Model model) {
		List<TeacherInfoView> list = teacherInfoViewService.getAll();
		model.addAttribute("list", list);
		return "/admin/teacherlist";
	}

	@RequestMapping(value = "/addteacher", method = { RequestMethod.GET })
	public String addteacherUI(Model model) {
		List<Major> list = majorService.getAllMajor();
		model.addAttribute("Majorlist", list);
		return "/admin/addteacher";
	}

	@RequestMapping(value = "/addteacher", method = { RequestMethod.POST })
	public String addteacher(Teacher teacher) {
		int a = teacherService.addTeacher(teacher);
		if (a == 0)
			return "error";
		return "redirect:/admin/teacherlist";
	}

	@RequestMapping(value = "/editteacher", method = { RequestMethod.GET })
	public String editteacherUI(Long teaId, Model model) {
		if (teaId == null)
			return "redirect:/admin/teacherlist";

		Teacher teacher = teacherService.getById(teaId);
		List<Major> list = majorService.getAllMajor();
		model.addAttribute("list", list);
		model.addAttribute("teacher", teacher);
		return "/admin/editteacher";
	}

	@RequestMapping(value = "/editteacher", method = { RequestMethod.POST })
	public String editteacher(Teacher teacher) {
		teacherService.updateTeacher(teacher);
		return "redirect:/admin/teacherlist";
	}

	@RequestMapping(value = "/removeteacher", method = { RequestMethod.GET })
	private String removeteacher(Long teaId) {
		teacherService.delete(teaId);
		return "redirect:/admin/teacherlist";
	}

	@RequestMapping(value = "selectteacher", method = { RequestMethod.POST })
	private String selectteacher(String findByName, Model model) {
		long teaId = Long.parseLong(findByName);
		model.addAttribute("student", teacherService.getById(teaId));
		return "/admin/teacherlist";
	}
	/*
	 * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<�γ̲���>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	 * >> >>>>
	 */

	@RequestMapping(value = "courselist")
	public String courselist(Model model) {
		List<Course> list = courseService.getAllCourse();
		model.addAttribute("list", list);
		return "/admin/courselist";
	}

	@RequestMapping(value = "/addcourse", method = { RequestMethod.GET })
	public String addcourseUI(Model model) {

		return "/admin/addcourse";
	}

	@RequestMapping(value = "/addcourse", method = { RequestMethod.POST })
	public String addcourse(Course course) {
		int a = courseService.addCourse(course);
		if (a == 0)
			return "error";
		return "redirect:/admin/courselist";
	}

	@RequestMapping(value = "/editcourse", method = { RequestMethod.GET })
	public String editcourseUI(Long courseId, Model model) {
		if (courseId == 0)
			return "redirect:/admin/courselist";

		Course course = courseService.getByCourseId(courseId);

		model.addAttribute("teacher", course);
		return "/admin/editcourse";
	}

	@RequestMapping(value = "/editcourse", method = { RequestMethod.POST })
	public String editcourse(Teacher teacher) {
		teacherService.updateTeacher(teacher);
		return "redirect:/admin/courselist";
	}

	@RequestMapping(value = "/removecourse", method = { RequestMethod.GET })
	private String removecourse(Long courseId) {
		courseService.delete(courseId);
		return "redirect:/admin/courselist";
	}

	@RequestMapping(value = "selectcourse", method = { RequestMethod.POST })
	private String selectcourse(String findByName, Model model) {
		long courseId = Long.parseLong(findByName);
		model.addAttribute("student", courseService.getByCourseId(courseId));
		return "/admin/courselist";
	}

	/*
	 * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<�γ̲���>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	 * >> >>>>
	 */

	@RequestMapping(value = "/userlist")
	public String userlist(Model model) {
		List<User> list = userService.getAll();
		model.addAttribute("list", list);
		return "/admin/userlist";
	}
	@RequestMapping(value = "/editUser")
	public String edituser(long userId,Model model) {
		return "/admin/userlist";
	}
	
}
