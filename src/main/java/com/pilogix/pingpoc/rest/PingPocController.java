package com.pilogix.pingpoc.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.saml2.provider.service.authentication.Saml2AuthenticatedPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@CrossOrigin
@Slf4j
public class PingPocController {

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/secured/hello")
    public String hello(@AuthenticationPrincipal Saml2AuthenticatedPrincipal principal, Model model) {
        model.addAttribute("secured-name", principal.getName());
        log.info("SSO for User Completed: " + principal.getName());
        return "securedhome";
    }

    @GetMapping("/redirect")
    public void redirect(@RequestParam String url, HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("Redirecting to: " + url);
        response.sendRedirect(url);
    }

}
