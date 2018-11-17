package com.hzit.wxnet.service;

import com.hzit.wxnet.service.vo.openid.WxPageVo;
import com.hzit.wxnet.service.vo.WxUserInfoVo;
import com.hzit.wxnet.service.vo.tag.CreateOrDeleteTagVo;
import com.hzit.wxnet.service.vo.tag.TagListVo;
import com.hzit.wxnet.service.vo.tag.TagVo;

import java.util.List;

public interface WxUserinfoService {

    /**
     * 根据用户的OPENid获取用户信息
     * @param openid
     * @return
     */
    WxUserInfoVo findByOpenId(String openid);


    /**
     * 获取所有用户的OPENID
     * @param nextopenid
     * @return
     */
    WxPageVo findAll(String nextopenid);

    //创建一个用户标签
    TagVo createTag(String tagname);
    //获取指定标签下的用户列表
    WxPageVo getWxUserinfoByTagId(int tagid);
    //获取所有的用户标签
    TagListVo fingAllTagVo();
    //根据标签ID删除指定的用户标签
    String deleteTag(int tagid);
    //给一批指定openid的用户打上标签
    void createTagForUser(CreateOrDeleteTagVo vo);
    //给一批指定openid的用户取消标签
    void deleteTagForUser(CreateOrDeleteTagVo vo);



}
