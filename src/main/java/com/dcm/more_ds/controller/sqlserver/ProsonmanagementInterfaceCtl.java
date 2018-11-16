package com.dcm.more_ds.controller.sqlserver;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dcm.more_ds.config.ctl.CtlResultAnnotation;
import com.dcm.more_ds.constant.ResultVO;
import com.dcm.more_ds.entity.sqlserver.ProsonmanagementInterface;
import com.dcm.more_ds.query.sqlserver.ProsonmanagementInterfaceExample;
import com.dcm.more_ds.service.sqlserver.ProsonmanagementInterfaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
  * @author xusanduo
  * @date 2018/11/14 14:35
  * @Description: 罪犯查询接口
  * @return
  * @throws
  */

@Api(value = "/zf/search", description = "罪犯查询接口")
@RestController
@RequestMapping("/zf/search")
public class ProsonmanagementInterfaceCtl {

	@Autowired
	private ProsonmanagementInterfaceService prosonmanagementInterfaceService;

	@ApiOperation(value = "pageList", notes = "分页查询", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/pageList")
	@CtlResultAnnotation
	public ResultVO<PageInfo<ProsonmanagementInterface>> pageList(
			ProsonmanagementInterface obj,
		    @RequestParam(defaultValue="1") int pageNum,
		    @RequestParam(defaultValue="10") int pageSize, HttpServletRequest request){

		ResultVO<PageInfo<ProsonmanagementInterface>> vo = new ResultVO<>();


		ProsonmanagementInterfaceExample example = new ProsonmanagementInterfaceExample();
		example.setOrderByClause(" zf_bh ");
		if(obj != null){
			ProsonmanagementInterfaceExample.Criteria c = example.createCriteria();
			if(!StringUtils.isEmpty(obj.getZfBh())){
				c.andZfBhLike("%" + obj.getZfBh() + "%");
			}
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<ProsonmanagementInterface> lst = this.prosonmanagementInterfaceService.selectByExample(example);
		vo.setData(new PageInfo<>(lst));
		return vo;
	}
	
}
