package com.jins.controller;

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

import com.jins.entity.Type;
import com.jins.service.TypeService;

@Controller
@RequestMapping("type")
public class TypeController {

	@Autowired
	private TypeService tservice;

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(Type type) {
		tservice.add(type);
		return "redirect:/type/list";
	}

	@RequestMapping("update/{id}")
	public String update(@PathVariable int id, Model m, HttpServletRequest request, HttpServletResponse response) {
		Type type = tservice.findById(id);
		System.out.println(type);
		m.addAttribute("type", type);
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "typeUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(Type type) {
		tservice.update(type);
		return "redirect:/type/list";
	}

	@RequestMapping("del/{id}")
	public String delete(@PathVariable Integer id) {
		tservice.delete(id);
		return "redirect:/type/list";
	}

	@RequestMapping("list")
	public String showList(Model m, HttpServletRequest request, HttpServletResponse response) {
		List<Type> lis = tservice.findAll();
		m.addAttribute("tlis", lis);
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "typeList";
	}

}
