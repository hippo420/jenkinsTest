package com.example.jenkinsTest.Controller;

import com.example.jenkinsTest.MyLogger;
import com.example.jenkinsTest.Service.LogService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;
    private final MyLogger myLogger;

    @RequestMapping("/main")
    public String log(HttpServletRequest request){
        String requsetURL = request.getRequestURL().toString();
        myLogger.setURL(requsetURL);
        myLogger.log("Controller call!");
        String logMessage = logService.log("gaebabja");
        return "index";
    }
}
