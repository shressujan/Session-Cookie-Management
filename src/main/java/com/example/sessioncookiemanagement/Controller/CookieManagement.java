package com.example.sessioncookiemanagement.Controller;

import com.example.sessioncookiemanagement.DAO.AccountDao;
import com.example.sessioncookiemanagement.DAO.AddressDao;
import com.example.sessioncookiemanagement.Service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@Controller
@RequestMapping("/")
public class CookieManagement {

  private final AccountService accountService;

  public CookieManagement(AccountService accountService) {
    this.accountService = accountService;
  }

  @GetMapping("/cookie")
  public String home(HttpServletRequest request, Model model){
    Cookie[] cookies = request.getCookies();
    if(cookies != null) {
      for (Cookie cookie: cookies
           ) {
        if(cookie.getName().equalsIgnoreCase("email")) {
          model.addAttribute("email", cookie.getValue());
        }
        if(cookie.getName().equalsIgnoreCase("address1")) {
          try {
            model.addAttribute("address1", URLDecoder.decode( cookie.getValue(), "UTF-8" ));
          } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
          }
        }
        if(cookie.getName().equalsIgnoreCase("address2")) {
          try {
            model.addAttribute("address2", URLDecoder.decode( cookie.getValue(), "UTF-8" ));
          } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
          }
        }
        if(cookie.getName().equalsIgnoreCase("city")) {
          model.addAttribute("city", cookie.getValue());
        }
        if(cookie.getName().equalsIgnoreCase("state")) {
          model.addAttribute("state", cookie.getValue());
        }
        if(cookie.getName().equalsIgnoreCase("zip")) {
          model.addAttribute("zip", cookie.getValue());
        }

      }
    }
    return "cookieDemo";
  }

  @PostMapping("/cookie")
  public String accountInfo( HttpServletRequest request, HttpServletResponse response, Model model) {

    AddressDao addressDao = new AddressDao();
    addressDao.setAddress1(request.getParameter("address1"));
    addressDao.setAddress2(request.getParameter("address2"));
    addressDao.setCity(request.getParameter("city"));
    addressDao.setState(request.getParameter("state"));
    addressDao.setZip(request.getParameter("zip"));

    AccountDao accountDao = new AccountDao();
    accountDao.setEmail(request.getParameter("email"));
    accountDao.setPassword(request.getParameter("password"));
    accountDao.setAddressDao(addressDao);

    Cookie emailCookie = new Cookie("email", accountDao.getEmail());
    Cookie addressCookie = null;
    try {
      addressCookie = new Cookie("address1", URLEncoder.encode( accountDao.getAddressDao().getAddress1(), "UTF-8" ));
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    Cookie address2Cookie = null;
    try {
      address2Cookie = new Cookie("address2", URLEncoder.encode( accountDao.getAddressDao().getAddress2(), "UTF-8" ));
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    Cookie cityCookie = new Cookie("city", accountDao.getAddressDao().getCity());
    Cookie stateCookie = new Cookie("state", accountDao.getAddressDao().getState());
    Cookie zipCookie = new Cookie("zip", accountDao.getAddressDao().getZip());



    emailCookie.setMaxAge(1*365*24*60*60); /*Set the cookie max age to 1 year*/
    addressCookie.setMaxAge(1*365*24*60*60);
    address2Cookie.setMaxAge(1*365*24*60*60);
    cityCookie.setMaxAge(1*365*24*60*60);
    stateCookie.setMaxAge(1*365*24*60*60);
    zipCookie.setMaxAge(1*365*24*60*60);

    response.addCookie(emailCookie);
    response.addCookie(addressCookie);
    response.addCookie(address2Cookie);
    response.addCookie(cityCookie);
    response.addCookie(stateCookie);
    response.addCookie(zipCookie);

    return "redirect:/cookie";
  }
}
