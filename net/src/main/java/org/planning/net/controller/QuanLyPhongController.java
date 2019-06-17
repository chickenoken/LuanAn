package org.planning.net.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuanLyPhongController {

    @RequestMapping(
            value = { "/quanLyDatPhong" },
            method = RequestMethod.GET)
    public ModelAndView welcomePage(Model model) throws Exception {
        return new ModelAndView("quanLyDatPhong");
    }
}
