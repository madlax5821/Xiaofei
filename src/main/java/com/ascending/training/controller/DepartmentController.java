package com.ascending.training.controller;

import com.ascending.training.model.Department;
import com.ascending.training.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/department", method = RequestMethod.GET)
    public void getDepartments() {
        logger.debug("Iam currently in the customer controller");
    }

    @RequestMapping(value = "/department/{Id}", method = RequestMethod.GET)
    public void getDepartmentById(@PathVariable(name = "Id") Long id) {
        logger.debug("I am in the customer controller get by" + id);
    }
}