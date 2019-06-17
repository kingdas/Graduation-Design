package com.jins.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jins.entity.Deliver;
import com.jins.entity.Job;
import com.jins.entity.JobType;
import com.jins.entity.User;
import com.jins.service.DeliverService;
import com.jins.service.JobService;
import com.jins.service.JobTypeService;
import com.jins.service.UserService;

@Controller
@RequestMapping("/job")
public class JobController {

	@Autowired
	JobService jobService;
	@Autowired
	JobTypeService jobTypeService;
	@Autowired
	DeliverService deliverService;
	@Autowired
	UserService userService;

	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestBody Job j, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("userId");
		if (userId == null)
			return null;
		Double jobSalary = null;
		if (j.getJobSalary() == null) {
			jobSalary = 0.0;
			j.setJobSalary(jobSalary);
		} else {
			j.setJobSalary(j.getJobSalary());
		}
		j.setUserId(userId);
		jobService.insert(j);
		return "success";
	}

	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@RequestBody Job job) {
		jobService.update(job);
		return "success";
	}

	@ResponseBody
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestBody Long[] ids) {
		jobService.deleteBatch(ids);
		return "success";
	}

	@ResponseBody
	@RequestMapping("/list")
	public List<Job> findAll() {
		List<Job> lis = new ArrayList<>();
		lis = jobService.findAll();
		return lis;
	}

	@ResponseBody
	@RequestMapping(value = "/condition", method = RequestMethod.POST)
	public List<Job> findByCondition(@RequestParam Map<String, Object> job) {
		String jobName;
		Integer jobType;
		if (job.get("jobName") != null && job.get("jobName") != "") {
			jobName = String.valueOf(job.get("jobName"));
		} else {
			jobName = "";
		}
		if (job.get("jobType") != null && job.get("jobType") != "") {
			jobType = Integer.valueOf(String.valueOf(job.get("jobType")));
		} else {
			jobType = null;
		}
		List<Job> lis = new ArrayList<>();
		lis = jobService.findByCondition(jobName, jobType);
		return lis;
	}

	@ResponseBody
	@RequestMapping(value = "/getAllTypes", method = RequestMethod.GET)
	public List<JobType> types() {
		List<JobType> lis = jobTypeService.findAll();
		return lis;
	}

	@ResponseBody
	@RequestMapping(value = "/selfPublish", method = RequestMethod.POST)
	public List<Job> findByUid(@RequestParam Map<String, Object> map, HttpServletRequest request) {
		Integer userId = (Integer) request.getSession().getAttribute("userId");
		String jobName;
		Integer jobType;
		if (map.get("jobName") == null) {
			jobName = null;
		} else
			jobName = (String) map.get("jobName");
		if (map.get("jobType") == null || map.get("jobType") == "") {
			jobType = null;
		} else
			jobType = Integer.valueOf(((String) map.get("jobType")));
		List<Job> lis = null;
		lis = jobService.findByUserId(userId, jobName, jobType);
		for (Job job : lis) {
			JobType jt = jobTypeService.findById(job.getJobType());
			job.setTypeName(jt.getTypeName());
		}
		return lis;
	}

	@ResponseBody
	@RequestMapping(value = "/publishDeal/{jobId}", method = RequestMethod.POST)
	public List<User> deliverUser(@PathVariable Integer jobId) {
		List<Deliver> lis = new ArrayList<>();
		List<User> userList = new ArrayList<>();
		lis = deliverService.findByJobId(jobId);
		for (Deliver deliver : lis) {
			User user = userService.findById(deliver.getUserId());
			userList.add(user);
		}
		return userList;
	}

	@ResponseBody
	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public Job findById(@PathVariable Integer id) {
		Job j = jobService.findById(id);
		return j;
	}

	@ResponseBody
	@RequestMapping(value = "/deliver/{id}", method = RequestMethod.POST)
	public String addDeliver(@PathVariable Integer id, HttpServletRequest request) {
		Integer userId = (Integer) (request.getSession().getAttribute("userId"));
		Date date = new Date();
		Deliver de = new Deliver(userId, id, date);
		deliverService.insert(de);
		return "success";
	}

	@ResponseBody
	@RequestMapping("/getTypeName/{jobType}")
	public JobType getTypeName(@PathVariable Integer jobType, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		JobType type = jobTypeService.findById(jobType);
		if (type == null) {
			return null;
		}
		return type;
	}
}
