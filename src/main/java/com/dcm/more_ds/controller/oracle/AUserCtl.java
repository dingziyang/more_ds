package com.dcm.more_ds.controller.oracle;

import com.dcm.more_ds.config.ctl.CtlResultAnnotation;
import com.dcm.more_ds.config.ctl.CtlValidAnnotation;
import com.dcm.more_ds.constant.ResultVO;
import com.dcm.more_ds.entity.oracle.AUser;
import com.dcm.more_ds.query.oracle.AUserExample;
import com.dcm.more_ds.service.oracle.AUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

import javax.validation.Valid;
import java.util.List;

/**
 * @ PackageName: com.dcm.more_ds.controller.oracle
 * @ ClassName: AUserCtl
 * @ Description: 用户控制器
 * @ Auther: dcm
 * @ Date: 2018-9-10 10:54
 */

@Api(value = "/jianyu/auser", description = "用户接口")
@RestController
@RequestMapping("/jianyu/auser")
public class AUserCtl {

    @Autowired
    private AUserService aUserService;

    @ApiOperation(value="新增", notes="新增实体", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "auser", value = "实体", required = true, dataType = "AUser")
    })
    @RequestMapping(value="", method=RequestMethod.POST)
    @CtlValidAnnotation
    @CtlResultAnnotation
    public ResultVO<Integer> create(@RequestBody @Valid AUser auser, BindingResult validResult) {
        ResultVO<Integer> vo = new ResultVO<>();
        vo.setData(Integer.parseInt( this.aUserService.insertSelective(auser)+""));
        return  vo;
    }

    @ApiOperation(value = "单个删除", notes = "根据主键删除实体", httpMethod = "DELETE", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "主键", required = true, dataType = "String")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @CtlResultAnnotation
    public ResultVO<Integer> delete(@PathVariable String id){

        ResultVO<Integer> vo = new ResultVO<>();
        vo.setData(this.aUserService.deleteByPrimaryKey(id));
        return vo;

    }

    @ApiOperation(value="批量删除", notes="根据主键数组删除实体集合", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "ids[]", value = "主键数组", required = true, allowMultiple=true, dataType = "String")
    })
    @RequestMapping(value="/delete", method=RequestMethod.POST)
    @CtlResultAnnotation
    public ResultVO<Integer> delete(@RequestParam(value = "ids[]") List<String> ids){
        ResultVO<Integer> vo = new ResultVO<>();
        vo.setData(this.aUserService.deleteByPrimaryKeys(ids));
        return vo;
    }

    @ApiOperation(value="更新", notes="根据主键指定更新实体，并根据传过来的实体信息来更新实体详情", httpMethod = "PUT", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "主键", required = true, dataType = "String"),
        @ApiImplicitParam(name = "auser", value = "实体", required = true, dataType = "AUser")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    @CtlValidAnnotation
    @CtlResultAnnotation
    public ResultVO<Integer> update(@PathVariable String id, @RequestBody @Valid AUser auser, BindingResult validResult) {
        ResultVO<Integer> vo = new ResultVO<>();
        auser.setId(id);
        vo.setData(Integer.parseInt( this.aUserService.updateByPrimaryKeySelective(auser)+""));
        return  vo;
    }

//    @ApiOperation(value="详情", notes="根据主键获取实体详情", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ApiImplicitParams({
//        @ApiImplicitParam(name = "id", value = "主键", required = true, dataType = "String")
//    })
//    @GetMapping("/{id}")
//    @CtlResultAnnotation
//    public ResultVO<AUser> view(@PathVariable String id){
//        ResultVO<AUser> vo = new ResultVO<>();
//        vo.setData(this.aUserService.selectByPrimaryKey(id));
//        return vo;
//    }

    @ApiOperation(value="详情", notes="根据username获取实体详情", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String")
    })
    @GetMapping("/{username}")
    @CtlResultAnnotation
    public ResultVO<AUser> getUserByName(@PathVariable String username){
        ResultVO<AUser> vo = new ResultVO<>();
        AUserExample example = new AUserExample();
        example.createCriteria().andUsernameEqualTo(username);

        List<AUser> lst = this.aUserService.selectByExample(example);
        if(CollectionUtils.isEmpty(lst)){
            new RuntimeException("用户不存在");
        } else {
            vo.setData(this.aUserService.selectByExample(example).get(0));
        }
        return vo;
    }

    @ApiOperation(value="列表查询", notes="根据实体，获取实体列表", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value="/list", method=RequestMethod.GET)
    @CtlResultAnnotation
    public ResultVO<List<AUser>> list(AUser auser) {
        ResultVO<List<AUser>> vo = new ResultVO<>();

        //AUser 与 example关联
        AUserExample example = new AUserExample();
        if ( auser != null) {
            AUserExample.Criteria c = example.createCriteria();
            if(!StringUtils.isEmpty(auser.getUsername())){
                c.andUsernameLike("%" + auser.getUsername() + "%");
            }
        }
        List<AUser> lst = this.aUserService.selectByExample(example);
        vo.setData(lst);
        return vo;
    }

    @ApiOperation(value="分页查询", notes="根据实体及分页参数，获取带有实体列表的分页数据", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum", value = "页码，默认值1", dataType = "int"),
        @ApiImplicitParam(name = "pageSize", value = "每页数量，默认值10", dataType = "int")
    })
    @RequestMapping(value="/pageList", method=RequestMethod.GET)
    @CtlResultAnnotation
    public ResultVO<PageInfo<AUser>> pageList(AUser auser, @RequestParam(defaultValue="1") int pageNum, @RequestParam(defaultValue="10") int pageSize){
        ResultVO<PageInfo<AUser>> vo = new ResultVO<>();

        //AUser 与 example关联
        AUserExample example = new AUserExample();
        if ( auser != null) {
            AUserExample.Criteria c = example.createCriteria();
            if(!StringUtils.isEmpty(auser.getUsername())){
                c.andUsernameLike("%" + auser.getUsername() + "%");
            }
        }
        PageHelper.startPage(pageNum, pageSize);
        List<AUser> lst = this.aUserService.selectByExample(example);
        vo.setData(new PageInfo<>(lst));
        return vo;
    }

}
