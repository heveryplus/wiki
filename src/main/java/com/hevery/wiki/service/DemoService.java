package com.hevery.wiki.service;

import com.hevery.wiki.domain.Demo;
import com.hevery.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: description
 * @author: hevery
 * @date: 2022/10/8
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
