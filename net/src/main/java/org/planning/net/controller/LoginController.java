package org.planning.net.controller;

import java.nio.file.AccessDeniedException;
import java.util.HashMap;
import java.util.Map;

import org.planning.net.dto.LoginDto;
import org.planning.net.entity.NhanVien;
import org.planning.net.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    private static final String VIEW_NAME = "Login";

    private static final String IS_NV = "isNv";

    @Autowired
    private LoginService loginService;

    @RequestMapping(
            value = { "/" },
            method = RequestMethod.GET)
    public ModelAndView welcomePage(Model model) throws Exception {
        return new ModelAndView("test");
    }

    @RequestMapping(
            value = { "/login" },
            method = RequestMethod.GET)
    public String getPage(Model model) throws AccessDeniedException {
        return VIEW_NAME;
    }

    @RequestMapping(
            value = "/login/dangNhap",
            method = RequestMethod.POST,
            consumes = "application/json")
    @ResponseBody
    public Object dangNhap(@RequestBody LoginDto model) throws Exception {
        Map<String, Object> initModel = new HashMap<String, Object>();
        try {
            NhanVien nv = loginService.dangNhap(model);
            if(!StringUtils.isEmpty(nv)) {
                initModel.put(IS_NV, nv);
            }
            return initModel;
        }catch(Exception ex) {
            return initModel.put("error", "error");
        }
    }
}
