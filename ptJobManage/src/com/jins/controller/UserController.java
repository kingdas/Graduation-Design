package com.jins.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jins.entity.User;
import com.jins.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService uservice;

	@RequestMapping("test")
	public String test(HttpSession ses, HttpServletResponse response) throws IOException {
		System.out.println("test");
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "frame";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String useAdd(User user, HttpServletRequest request, HttpServletResponse response) {
		uservice.add(user);
		return "redirect:/user/list";
	}

	@RequestMapping("update/{id}")
	public String update(@PathVariable int id, Model m, HttpServletRequest request, HttpServletResponse response) {
		User u = uservice.findById(id);
		m.addAttribute("u", u);
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "userUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(User u) {
		uservice.update(u);
		return "redirect:/user/list";
	}

	@RequestMapping("del/{id}")
	public String delete(@PathVariable int id) {
		uservice.delete(id);
		return "redirect:/user/list";
	}

	@RequestMapping("list")
	public String showList(Model m, HttpServletRequest request, HttpServletResponse response) {
		List<User> lis = uservice.findAll();
		m.addAttribute("lis", lis);
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "userList";
	}
}
