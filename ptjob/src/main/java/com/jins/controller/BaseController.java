package com.jins.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jins.entity.User;
import com.jins.service.UserService;

@Controller
@RequestMapping("/base")
public class BaseController {

	@Autowired
	UserService userService;

	@ResponseBody
	@RequestMapping(value = "/getInfo", method = RequestMethod.GET)
	public Integer getUser(HttpServletRequest request) {
		HttpSession ses = request.getSession();
		Integer userId = (Integer) ses.getAttribute("userId");
		return userId;
	}

	@ResponseBody
	@RequestMapping("/getLoginName")
	public String getLoginName(HttpServletRequest request) {
		HttpSession ses = request.getSession();
		String userLoginName = (String) ses.getAttribute("userLoginName");
		return userLoginName;
	}

	@ResponseBody
	@RequestMapping("/logout")
	public String logout(HttpSession ses) {
		ses.removeAttribute("userId");
		ses.removeAttribute("userLoginName");
		return "logout";
	}

	@ResponseBody
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String loginCheck(@RequestBody Map<String, Object> loginInfo, HttpSession ses) {
		ses.setMaxInactiveInterval(180 * 60);
		String userLoginName = String.valueOf(loginInfo.get("userLoginName"));
		String userPassword = String.valueOf(loginInfo.get("userPassword"));
		List<User> lis = userService.findByCondition(userLoginName, userPassword);
		if (lis != null && lis.size() > 0) {
			Integer userId = lis.get(0).getId();
			ses.setAttribute("userId", userId);
			ses.setAttribute("userLoginName", userLoginName);
			return "success";
		} else {
			return "error";
		}
	}

	@RequestMapping("/login")
	public String goLogin() {
		return "login";
	}

	@RequestMapping("/index")
	public String goIndex(HttpServletRequest request, HttpServletResponse reponse) {
		reponse.setContentType("text/html;charset = UTF-8");
		if (request.getSession().getAttribute("userId") == null) {
			try {
				PrintWriter out = reponse.getWriter();
				out.println("<script>");
				out.println("alert('请先登录');");
				out.println("location.href = 'login'");
				out.println("</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "index";
	}

	@RequestMapping("/publish")
	public String goPublish(HttpServletRequest request, HttpServletResponse reponse) {
		reponse.setContentType("text/html;charset = UTF-8");
		if (request.getSession().getAttribute("userId") == null) {
			try {
				PrintWriter out = reponse.getWriter();
				out.println("<script>");
				out.println("alert('请先登录');");
				out.println("location.href = 'login'");
				out.println("</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "publish";
	}

	@RequestMapping("/selfPublish")
	public String goSelfPublish(HttpServletRequest request, HttpServletResponse reponse) {
		reponse.setContentType("text/html;charset = UTF-8");
		if (request.getSession().getAttribute("userId") == null) {
			try {
				PrintWriter out = reponse.getWriter();
				out.println("<script>");
				out.println("alert('请先登录');");
				out.println("location.href = 'login'");
				out.println("</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "selfPublish";
	}

	@RequestMapping("/selfPublishDeal")
	public String goSelfPublishDeal(HttpServletRequest request, HttpServletResponse reponse) {
		reponse.setContentType("text/html;charset = UTF-8");
		if (request.getSession().getAttribute("userId") == null) {
			try {
				PrintWriter out = reponse.getWriter();
				out.println("<script>");
				out.println("alert('请先登录');");
				out.println("location.href = 'login'");
				out.println("</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "selfPublishDeal";
	}

	@RequestMapping("/selfInfo")
	public String goSelfInfo(HttpServletRequest request, HttpServletResponse reponse) {
		reponse.setContentType("text/html;charset = UTF-8");
		if (request.getSession().getAttribute("userId") == null) {
			try {
				PrintWriter out = reponse.getWriter();
				out.println("<script>");
				out.println("alert('请先登录');");
				out.println("location.href = 'login'");
				out.println("</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "selfInfo";
	}

	@RequestMapping("/selfInfoUpdate")
	public String goSelfInfoUpdate(HttpServletRequest request, HttpServletResponse reponse) {
		reponse.setContentType("text/html;charset = UTF-8");
		if (request.getSession().getAttribute("userId") == null) {
			try {
				PrintWriter out = reponse.getWriter();
				out.println("<script>");
				out.println("alert('请先登录');");
				out.println("location.href = 'login'");
				out.println("</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "selfInfoUpdate";
	}

	@RequestMapping("/jobInfo")
	public String goJobInfo(HttpServletRequest request, HttpServletResponse reponse) {
		reponse.setContentType("text/html;charset = UTF-8");
		if (request.getSession().getAttribute("userId") == null) {
			try {
				PrintWriter out = reponse.getWriter();
				out.println("<script>");
				out.println("alert('请先登录');");
				out.println("location.href = 'login'");
				out.println("</script>");
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "jobInfo";
	}
}
