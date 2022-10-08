package com.hevery.wiki.service;

import com.hevery.wiki.domain.Ebook;
import com.hevery.wiki.domain.EbookExample;
import com.hevery.wiki.mapper.EbookMapper;
import com.hevery.wiki.req.EbookReq;
import com.hevery.wiki.resp.EbookResp;
import com.hevery.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: description
 * @author: hevery
 * @date: 2022/10/8
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
