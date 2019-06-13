/**
 * 
 */
package com.dc.lwm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李巍岷
   @date	2019年6月10日
 *
 * 
 */
@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
	@RequestMapping(value = "/index")
	public String teaindex() {
		return "teacher/index";
	}
}
