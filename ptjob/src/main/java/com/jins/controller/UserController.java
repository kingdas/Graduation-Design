package com.jins.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jins.entity.Deliver;
import com.jins.entity.User;
import com.jins.service.DeliverService;
import com.jins.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	DeliverService deliverService;

	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestBody User user) {
		userService.insert(user);
		return "success";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@RequestBody Map<String, Object> user, HttpSession ses) {
		Object ui = ses.getAttribute("userId");
		Integer userId = Integer.valueOf(String.valueOf(ui));
		String userName = String.valueOf(user.get("userName"));
		String userSex = String.valueOf(user.get("userSex"));
		String userAge = String.valueOf(user.get("userAge"));
		String userDegree = String.valueOf(user.get("userDegree"));
		String userExp = String.valueOf(user.get("userExp"));
		String userHobby = String.valueOf(user.get("userHobby"));
		String userSpec = String.valueOf(user.get("userSpec"));
		String userTel = String.valueOf(user.get("userTel"));
		String userWeChat = String.valueOf(user.get("userWeChat"));
		String userQQ = String.valueOf(user.get("userQQ"));
		String userLoginName = String.valueOf(user.get("userLoginName"));
		String userPassword = String.valueOf(user.get("userPassword"));
		String remark = String.valueOf(user.get("remark"));
		User u = new User(userId, userName, userSex, userAge, userDegree, userExp, userHobby, userSpec, userTel,
				userWeChat, userQQ, userLoginName, userPassword, remark);
		userService.update(u);
		return "selfInfo";
	}

	@ResponseBody
	@RequestMapping(value = "/findOne/{userId}", method = RequestMethod.GET)
	public User findById(@PathVariable Integer userId) {// 用来查找某一个兼职的投递用户
		User user = userService.findById(userId);
		return user;
	}

	@ResponseBody
	@RequestMapping(value = "/findOne", method = RequestMethod.GET)
	public User findById2(HttpServletRequest request) {// 用来查找用户自己的信息
		Integer userId = (Integer) request.getSession().getAttribute("userId");
		User user = userService.findById(userId);
		return user;
	}

	@RequestMapping("/findByJobId")
	public List<Deliver> findByJobId(Integer jobId) {
		List<Deliver> lis = new ArrayList<>();
		lis = deliverService.findByJobId(jobId);
		return lis;
	}

}
