package project.organizer.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import project.organizer.data.User;
import project.organizer.service.UserService;


@Controller
@RequestMapping("/start")
public class StartPageController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getStartPage(Model model) {
        model.addAttribute("user", new User());
        return "startPage";
    }
    @PostMapping
    public String getModel(@ModelAttribute User user, Model model) {
        userService.saveOrUpdate(user);
        model.addAttribute("user", user);
        return "ShowUser";
    }

    @GetMapping("/{id}" )
    @ResponseBody
    public User getStartPage(@PathVariable Long id) {
        return userService.getById(id);
    }
}
