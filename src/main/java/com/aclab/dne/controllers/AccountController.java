package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.services.PersonneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/account")
@Api(tags = { SwaggerConfig.ACCOUNT })
public class AccountController {

    @Autowired
    private PersonneService personneService;

    @PostMapping("/login")
    @ApiOperation("Identification du compte")
    public String login(@ApiParam("Password") @RequestParam String password, @ApiParam("Username") @RequestParam String username) {
        return personneService.login(username,password).toString();

    }
}
