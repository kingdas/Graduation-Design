package com.jins.base;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jins.entity.Admin;
import com.jins.service.AdminService;

@Controller
@RequestMapping("base")
public class BaseController {

	@Autowired
	private AdminService admservice;

	@RequestMapping("{page}")
	public String goPage(@PathVariable String page) {
		return page;
	}

	@ResponseBody
	@RequestMapping(value = "loginCheck/{adminName}/{adminPassword}", method = RequestMethod.POST)
	public String loginCheck(@PathVariable String adminName, @PathVariable String adminPassword, HttpSession ses) {
		Admin adm = new Admin(adminName, adminPassword);
		List<Admin> lis = admservice.findByCondition(adm);
		if (lis != null && lis.size() > 0) {
			int adminId = lis.get(0).getId();
			String admName = (String) lis.get(0).getName();
			ses.setAttribute("adminId", adminId);
			ses.setAttribute("admName", admName);
			return "success";
		}
		return "error";
	}

	@RequestMapping("logout")
	public String logout(HttpSession ses) {
		ses.removeAttribute("adminId");
		return "redirect:/login.jsp";
	}
}
