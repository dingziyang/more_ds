package com.dcm.more_ds.entity.mysql;

import com.dcm.more_ds.constant.base.BaseModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * @author dcm
  * @date 2018-6-26 9:12
  * @Description: 单位
  * @return
  * @throws
  */
public class Unit extends BaseModel<Unit> {
    private static final long serialVersionUID = 2427144317634915347L;

    /** 主键 */
    @ApiModelProperty(value = "主键")
    private Long id;

    /** 单位名称 */
    @ApiModelProperty(value = "单位名称")
    @NotEmpty(message="单位名称不能为空")
    private String name;

    /** 单位编码 */
    @ApiModelProperty(value = "单位编码")
    @NotEmpty(message="单位编码不能为空")
    private String code;

    /** 单位级别 */
    @ApiModelProperty(value = "单位级别[1,10]")
    @Min(value = 1, message = "单位级别最小1")
    @Max(value = 10, message = "单位级别最大10")
    private Integer level;

    /** 排序 */
    @ApiModelProperty(value = "排序")
    private Integer idx;

    /** 启用？(0-false,1-true) */
    @ApiModelProperty(value = "启用？(0-false,1-true)")
    @Min(value = 0, message = "启用？只能是0或1")
    @Max(value = 1, message = "启用？只能是0或1")
    private Integer enable;

    /** 备注 */
    @ApiModelProperty(value = "备注")
    private String remark;

    /** 创建人 */
    @ApiModelProperty(value = "创建人")
    private Long createBy;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /** 修改人 */
    @ApiModelProperty(value = "修改人")
    private Long updateBy;

    /** 修改时间 */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    /** 下一级单位集合 */
    @ApiModelProperty(value = "下一级单位集合")
    private List<Unit> children = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public Unit setId(Long id) {
        this.id = id;
		return this;
    }

    public String getName() {
        return name;
    }

    public Unit setName(String name) {
        this.name = name == null ? null : name.trim();
		return this;
    }

    public String getCode() {
        return code;
    }

    public Unit setCode(String code) {
        this.code = code == null ? null : code.trim();
		return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Unit setLevel(Integer level) {
        this.level = level;
		return this;
    }

    public Integer getIdx() {
        return idx;
    }

    public Unit setIdx(Integer idx) {
        this.idx = idx;
		return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public Unit setEnable(Integer enable) {
        this.enable = enable;
		return this;
    }

    public String getRemark() {
        return remark;
    }

    public Unit setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
		return this;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public Unit setCreateBy(Long createBy) {
        this.createBy = createBy;
		return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Unit setCreateTime(Date createTime) {
        this.createTime = createTime;
		return this;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public Unit setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
		return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Unit setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
		return this;
    }

    public List<Unit> getChildren() {
        return children;
    }

    public void setChildren(List<Unit> children) {
        this.children = children;
    }
}
