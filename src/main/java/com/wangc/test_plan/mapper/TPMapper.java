package com.wangc.test_plan.mapper;

import com.wangc.test_plan.bean.TestPlanBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchao on 2017/2/10.
 */

@Mapper
public interface TPMapper {
    
    int insert(TestPlanBean testPlanBean);
    
    
}
