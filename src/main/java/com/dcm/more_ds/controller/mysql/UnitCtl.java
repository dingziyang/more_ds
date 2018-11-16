//package com.dcm.more_ds.controller.mysql;
//
//import com.dcm.more_ds.config.ctl.CtlResultAnnotation;
//import com.dcm.more_ds.config.ctl.CtlValidAnnotation;
//import com.dcm.more_ds.constant.ResultVO;
//import com.dcm.more_ds.entity.mysql.Unit;
//import com.dcm.more_ds.query.mysql.UnitExample;
//import com.dcm.more_ds.service.mysql.UnitService;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.StringUtils;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @PackageName: com.dcm.more_ds.controller.mysql
// * @ClassName: UnitCtl
// * @Description: 单位控制器
// * @Auther: dcm
// * @Date: 2018-5-18 10:41
// */
//
//@Api(value = "unit", description = "单位接口")
//@RestController
//@RequestMapping("/system/unit")
//public class UnitCtl {
//
//    @Autowired
//    private UnitService unitService;
//
//    @ApiOperation(value = "pageList", notes = "分页查询", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping("/pageList")
//    @CtlResultAnnotation
//    public ResultVO<PageInfo<Unit>> pageList(Unit unit, @RequestParam(defaultValue="1") int pageNum,
//                                             @RequestParam(defaultValue="10") int pageSize, HttpServletRequest request){
//
//        ResultVO<PageInfo<Unit>> vo = new ResultVO<>();
//
//        //Unit 与 example关联
//        UnitExample example = new UnitExample();
//        example.setOrderByClause(" level ");
//        if ( unit != null) {
//            UnitExample.Criteria c = example.createCriteria();
//            if(!StringUtils.isEmpty(unit.getName())){
//                c.andNameLike("%" + unit.getName() + "%");
//            }
//            if(!StringUtils.isEmpty(unit.getCode())){
//                c.andCodeLike("%" + unit.getCode() + "%");
//            }
//            if(!StringUtils.isEmpty(unit.getLevel())){
//                c.andLevelEqualTo(unit.getLevel());
//            }
//            if(!StringUtils.isEmpty(unit.getEnable())){
//                c.andEnableEqualTo(unit.getEnable());
//            }
//        }
//        PageHelper.startPage(pageNum, pageSize);
//        List<Unit> lst = this.unitService.selectByExample(example);
//        vo.setData(new PageInfo<>(lst));
//        return vo;
//    }
//
//    @ApiOperation(value = "list", notes = "列表查询", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping("/list")
//    @CtlResultAnnotation
//    public ResultVO<List<Unit>> list(Unit unit){
//
//        ResultVO<List<Unit>> vo = new ResultVO<>();
//
//        // Unit 与 example关联
//        UnitExample example = new UnitExample();
//        if ( unit != null) {
//            UnitExample.Criteria c = example.createCriteria();
//            if(!StringUtils.isEmpty(unit.getName())){
//                c.andNameLike("%" + unit.getName() + "%");
//            }
//            if(!StringUtils.isEmpty(unit.getCode())){
//                c.andCodeLike("%" + unit.getCode() + "%");
//            }
//            if(!StringUtils.isEmpty(unit.getEnable())){
//                c.andEnableEqualTo(unit.getEnable());
//            }
//        }
//
//        List<Unit> lst = this.unitService.selectByExample(example);
//        vo.setData(lst);
//        return  vo;
//    }
//
//    @ApiOperation(value = "children", notes = "查询子列表", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping("/children")
//    @CtlResultAnnotation
//    public ResultVO<List<Unit>> getChildren(Unit unit){
//
//        ResultVO<List<Unit>> vo = new ResultVO<>();
//
////        //Unit 与 example关联
////        UnitExample example = new UnitExample();
////        if (unit != null) {
////            UnitExample.Criteria c = example.createCriteria();
////            if(!StringUtils.isEmpty(unit.getCode())){
////                c.andCodeLike(unit.getCode() + "%");
////            }
////            if(!StringUtils.isEmpty(unit.getName())){
////                c.andNameLike("%" + unit.getName() + "%");
////            }
////            c.andLevelEqualTo(unit.getLevel() + 1);
////        }
////        List<Unit> children = this.unitService.selectByExample(example);
////        vo.setData(children);
//        vo.setData(this.unitService.getChildren(unit));
//        return  vo;
//    }
//
//    @ApiOperation(value = "rootTree", notes = "根单位树", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping("/rootTree")
//    @CtlResultAnnotation
//    @ResponseBody
//    public ResultVO<List<Unit>> rootTree(){
//
//        ResultVO<List<Unit>> vo = new ResultVO<>();
//        List<Unit> units = new ArrayList<>();
//        units.add(this.unitService.getRootTree());
//        vo.setData(units);
//
//        return vo;
//    }
//
//    @ApiOperation(value = "create", notes = "增", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
//    @PostMapping("/create")
//    @CtlResultAnnotation
//    @CtlValidAnnotation
//    public ResultVO<Integer> create(@RequestBody @Valid Unit unit, BindingResult validResult, HttpServletRequest request){
//        ResultVO<Integer> vo = new ResultVO<>();
//        unit.setCreateBy(9999L);
//        unit.setUpdateBy(9999L);
//
//        UnitExample example = new UnitExample();
//        example.createCriteria().andCodeEqualTo(unit.getCode());
//        List<Unit> existUnits = this.unitService.selectByExample(example);
//        if (CollectionUtils.isEmpty(existUnits)) {
//            vo.setData(Integer.parseInt( this.unitService.insertSelective(unit)+""));
//        } else {
//            throw new RuntimeException("菜单编码["+ unit.getCode() +"]已存在，不可重复创建");
//        }
//        return vo;
//    }
//
//    @ApiOperation(value = "update", notes = "改", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
//    @PostMapping("/update")
//    @CtlResultAnnotation
//    @CtlValidAnnotation
//    public ResultVO<Integer> update(@RequestBody @Valid Unit unit, BindingResult validResult, HttpServletRequest request){
//
//        if(unit.getId() == null) {
//            throw new RuntimeException("缺少主键：id");
//        }
//
//        ResultVO<Integer> vo = new ResultVO<>();
//
//        UnitExample example = new UnitExample();
//        example.createCriteria().andCodeEqualTo(unit.getCode());
//        List<Unit> existUnits = this.unitService.selectByExample(example);
//
//        if (CollectionUtils.isEmpty(existUnits)) { // 不可重复项都不匹配
//            vo.setData(Integer.parseInt( this.unitService.updateByPrimaryKeySelective(unit)+"")); // 修改
//        } else {
//            if (existUnits.size() == 1) { // 找到一个匹配项
//                if(existUnits.get(0).getId().equals(unit.getId())) { // 是自己，则修改
//                    vo.setData(Integer.parseInt( this.unitService.updateByPrimaryKeySelective(unit)+""));
//                } else { // 不是自己，则表示已存在
//                    throw new RuntimeException("菜单编码["+ unit.getCode() +"]已存在，不可修改为此值");
//                }
//            } else { // 找到多个匹配项，则表示已存在
//                throw new RuntimeException("菜单编码["+ unit.getCode() +"]已存在，不可修改为此值");
//            }
//        }
//        return vo;
//    }
//
//    @ApiOperation(value = "view", notes = "详情", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping("/view")
//    @CtlResultAnnotation
//    public ResultVO<Unit> view(@RequestParam Long id){
//        ResultVO<Unit> vo = new ResultVO<>();
//        Unit unit = this.unitService.selectByPrimaryKey(id);
//        if(unit != null) {
//            UnitExample example = new UnitExample();
//            example.createCriteria().andCodeLike(unit.getCode() + "%");
//            List<Unit> children = this.unitService.selectByExample(example);
//            if(children != null) unit.setChildren(children);
//        }
//        vo.setData(unit);
//        return vo;
//    }
//
//    /**
//      * @author dcm
//      * @date 2018-6-11 14:30
//      * @Description: 删除
//      *  controller参数@RequestParam(value = "ids[]") List<Long> ids：对应的ajax写法(不用contentType，不用dataType)
//      *  controller参数@RequestParam(value = "ids") List<Long> ids：对应的ajax写法(不用contentType，不用dataType，traditional: true 阻止深度序列化对象)
//      * @param: ids
//      * @throws
//      */
//    @ApiOperation(value = "delete", notes = "删", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
//    @PostMapping("/delete")
//    @CtlResultAnnotation
//    public ResultVO<Integer> delete(@RequestParam(value = "ids[]") List<Long> ids){
//        ResultVO<Integer> vo = new ResultVO<>();
//        vo.setData(this.unitService.deleteByIds(ids));
//        return vo;
//    }
//
//}
