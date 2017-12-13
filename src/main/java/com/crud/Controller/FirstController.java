package com.crud.Controller;

import com.crud.Model.FirstModel;
import com.crud.Pojos.UserPojo;
import com.crud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FirstController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@RequestBody UserPojo userPojo) {
        FirstModel firstModel = new FirstModel();
        firstModel.setName(userPojo.getName());
        firstModel.setAddress(userPojo.getAddress());
        firstModel.setEmail(userPojo.getEmail());
        firstModel.setPhno(userPojo.getPhno());
        userService.addUser(firstModel);

        return "redirect:/";
    }

    @RequestMapping(value = "/findOne")
    @ResponseBody
    public FirstModel findOne() {
        return null;
    }

    @RequestMapping(value = "/")
    public String findAll(Model model) {
        List<FirstModel> firstModelList=userService.findAll();
        System.out.println(firstModelList);
        model.addAttribute("userList", firstModelList);
        return "home";
    }

    @RequestMapping(value = "/delete/{id}")
    public String removeOne(@PathVariable("id") Long id ,Model model) {
        userService.removeOne(id);
        List<FirstModel> firstModelList=userService.findAll();
        model.addAttribute("userList",firstModelList);
        return "redirect:/";
    }
}
