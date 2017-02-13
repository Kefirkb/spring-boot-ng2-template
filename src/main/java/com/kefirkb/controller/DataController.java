package com.kefirkb.controller;

import com.kefirkb.model.SomeEntity;
import com.kefirkb.service.SomeEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by kefirkb on 30.01.2017.
 */

@CrossOrigin
@RestController
public class DataController {

    @Autowired
    private SomeEntityService firstEntityService;

    @RequestMapping(value = "/first", method = GET)
    @ResponseBody
    public List<SomeEntity> getFirst() throws IOException {
        return firstEntityService.findAllFirstEntity();
    }

}