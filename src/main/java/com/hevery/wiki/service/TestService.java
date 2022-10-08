package com.hevery.wiki.service;

import com.hevery.wiki.domain.Test;
import com.hevery.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: description
 * @author: hevery
 * @date: 2022/10/8
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
