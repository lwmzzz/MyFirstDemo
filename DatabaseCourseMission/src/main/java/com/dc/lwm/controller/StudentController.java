/**
 * 
 */
package com.dc.lwm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 鏉庡穽宀�
   @date	2019骞�6鏈�10鏃�
 *
 * 
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
	@RequestMapping(value = "/index")
	public String index() {
		return "/student/index";
	}
	@RequestMapping(value = "/courselist")
	   public String courselist(Model model) {
		   
		//   List<StudentScoreView> list = ssvs.getByStuId(stuId);
		   return "";
	   }
}
