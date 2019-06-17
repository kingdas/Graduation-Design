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
import com.jins.entity.Job;
import com.jins.entity.Type;
import com.jins.service.JobService;
import com.jins.service.TypeService;

@Controller
@RequestMapping("job")
public class JobController {

	@Autowired
	private JobService jservice;
	@Autowired
	private TypeService tservice;

	@RequestMapping("add")
	public String add(Model m, HttpServletRequest request, HttpServletResponse response) {
		List<Type> lis = tservice.findAll();
		m.addAttribute("types", lis);
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "add";
	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String doAdd(Job job) {
		jservice.add(job);
		return "redirect:/job/list";
	}

	@RequestMapping("list")
	public String showList(Model m, HttpServletRequest request, HttpServletResponse response) {
		List<Job> lis = jservice.findAll();
		for (Job job : lis) {
			Type t = tservice.findById(job.getJobType());
			if (t == null) {
				job.setTypeName("");
			} else
				job.setTypeName(t.getTypeName());
		}
		m.addAttribute("jlis", lis);
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "jobList";
	}

	@RequestMapping("update/{id}")
	public String update(@PathVariable Integer id, Model m, HttpServletRequest request, HttpServletResponse response) {
		Job j = jservice.findById(id);
		List<Type> lis = tservice.findAll();
		m.addAttribute("types", lis);
		m.addAttribute("job", j);
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("adminId");
		if (o == null) {
			return "redirect:/login.jsp";
		}
		return "jobUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(Job job, Model m) {
		jservice.update(job);
		return "redirect:/job/list";
	}

	@RequestMapping("del/{id}")
	public String delete(@PathVariable Integer id) {
		jservice.delete(id);
		return "redirect:/job/list";
	}

}
