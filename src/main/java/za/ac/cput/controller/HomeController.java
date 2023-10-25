package za.ac.cput.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    // Route redirects to React Frontend home page
    @RequestMapping("/")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:3000");
        return redirectView;
    }

    // Route redirects to React Frontend home page
    @RequestMapping("/welcome")
    public RedirectView welcomeRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:3000");
        return redirectView;
    }


    @GetMapping(value = "/admin")
    public RedirectView getAdminPage() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:3000/admin");
        return redirectView;
    }

    @GetMapping("/contact")
    public String getContactPage() {
        return "/ContactSection";
    }

    @GetMapping("/painter")
    public String getPainterPage() {
        return "/painterPage";
    }

    @GetMapping("/common")
    public String getCommonPage() {
        return "/commonPage";
    }

    @GetMapping("/accessDenied")
    public String getAccessDeniedPage() {
        return "/accessDeniedPage";
    }
}
