package org.planning.net.controller;

import java.nio.file.AccessDeniedException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrangChuController {

    private static final String VIEW_NAME = "trangChu";

    @RequestMapping(
            value = { "/trangChu" },
            method = RequestMethod.GET)
    public String getPage(Model model) throws AccessDeniedException {
        return VIEW_NAME;
    }

    @RequestMapping(
            value = { "/test" },
            method = RequestMethod.GET)
    public String getPage1(Model model) throws AccessDeniedException {
        return "test";
    }
}
