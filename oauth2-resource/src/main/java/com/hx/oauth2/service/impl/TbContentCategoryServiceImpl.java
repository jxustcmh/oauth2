package com.hx.oauth2.service.impl;

import com.hx.oauth2.mapper.TbContentCategoryMapper;
import com.hx.oauth2.service.TbContentCategoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
