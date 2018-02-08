package com.didispace;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author 翟永超
 * @create 2017/4/15.
 * @blog http://blog.didispace.com
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String findById(@PathVariable Long id) throws ExecutionException, InterruptedException {
        return userService.findById(id).get();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<String> findByIds(@RequestParam String ids) throws ExecutionException, InterruptedException {
        List<Long> idList = new ArrayList<>();
        for (String id : ids.split(",")) {
            idList.add(Long.valueOf(id));
        }
        return userService.findByIds(idList);
    }
}
