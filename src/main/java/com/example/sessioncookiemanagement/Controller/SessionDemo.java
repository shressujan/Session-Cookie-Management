package com.example.sessioncookiemanagement.Controller;

import com.example.sessioncookiemanagement.DAO.UserDao;
import com.example.sessioncookiemanagement.Domain.User;
import com.example.sessioncookiemanagement.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class SessionDemo {

  private final UserService userService;
  private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

  public SessionDemo(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/session")
  public String Home() {
    return "home";
  }

  @PostMapping("/session")
  public String addUser(HttpServletRequest request, Model model) {
    logger.info("adding User");

    HttpSession httpSession = request.getSession();
    List<UserDao> userList = (List<UserDao>) httpSession.getAttribute("userList");
    if(userList == null) {
      userList = new ArrayList<>();
      httpSession.setAttribute("userList", userList);
    }

    UserDao userDao = new UserDao();
    userDao.setFirstName(request.getParameter("firstName"));
    userDao.setLastName(request.getParameter("lastName"));
    userDao.setEmail(request.getParameter("email"));
    userDao.setPassword(request.getParameter("password"));

    userList.add(userDao);
    model.addAttribute("userList", userList);

    return "user";
  }
}
