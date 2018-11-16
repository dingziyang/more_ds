package com.dcm.more_ds.controller.mysql;

import com.dcm.more_ds.config.ctl.CtlResultAnnotation;
import com.dcm.more_ds.config.ctl.CtlValidAnnotation;
import com.dcm.more_ds.constant.ResultVO;
import com.dcm.more_ds.entity.mysql.DicBase;
import com.dcm.more_ds.query.mysql.DicBaseExample;
import com.dcm.more_ds.service.mysql.DicBaseService;
import com.dcm.more_ds.vo.DicBaseVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.dcm.more_ds.controller.mysql
 * @ClassName: DicBaseCtl
 * @Description: 基础数据字典控制器
 * @Auther: dcm
 * @Date: 2018-5-18 10:41
 */

@Api(value = "dicBase", description = "数据字典接口")
@RestController
@RequestMapping("/mysql/dicBase")
public class DicBaseCtl {

    @Autowired
    private DicBaseService dicBaseService;

    @ApiOperation(value = "getValuesBykey", notes = "通过字典key获取values", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "字典key", dataType = "string"),
            @ApiImplicitParam(name = "floor", value = "需要返回字典数据的层数：1<=floor<=10", dataType = "int")
    })
    @GetMapping("/dicValues")
    @CtlResultAnnotation
    public ResultVO<Map<String, List<DicBaseVO>>> getValuesBykey(@RequestParam(value = "key") String key, @RequestParam(value = "floor") int floor){
        ResultVO<Map<String, List<DicBaseVO>>> vo = new ResultVO<>();

        Map<String, List<DicBaseVO>> map = Maps.newHashMap();
        if(StringUtils.isEmpty(key)){
            throw new RuntimeException("参数不合法：参数key为空值");
        }
        if(floor < 1 || floor > 10){
            throw new RuntimeException("参数不合法：要求(1<=floor<=10)");
        }

        List<DicBaseVO> values = this.dicBaseService.getValueByKey(key, floor);
        map.put(key, values);
        vo.setData(map);
        return vo;
    }

}
