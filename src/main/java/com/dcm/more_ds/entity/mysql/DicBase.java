package com.dcm.more_ds.entity.mysql;

import com.dcm.more_ds.constant.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApiModel(description = "字典表对象")
public class DicBase extends BaseModel<DicBase> {
    private static final long serialVersionUID = 968725667045796931L;

    /** 主键 */
    @ApiModelProperty(value = "主键")
    private Long id;

    /** 字典项标码-带层级关系 */
    @ApiModelProperty(value = "字典项标码-带层级关系")
    private String code;

    /** 字典项key名(大小写不敏感) */
    @ApiModelProperty(value = "字典项key名(大小写不敏感)")
    private String dickey;

    /** 字典项编码 */
    @ApiModelProperty(value = "字典项编码")
    private String diccode;

    /** 字典项名称 */
    @ApiModelProperty(value = "字典项名称")
    private String name;

    /** 拼音 */
    @ApiModelProperty(value = "拼音")
    private String pinyin;

    /** 字典项级别 */
    @ApiModelProperty(value = "字典项级别")
    private Integer level;

    /** 排序号 */
    @ApiModelProperty(value = "排序号")
    private Integer idx;

    /** 启用？(0-false,1-true) */
    @ApiModelProperty(value = "启用？(0-false,1-true)")
    private Integer enable;

    /** 是否默认值？(0-false,1-true) */
    @ApiModelProperty(value = "是否默认值？(0-false,1-true)")
    private Integer defaults;

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

    /** 下一级字典项集合 */
    @ApiModelProperty(value = "下一级字典项集合")
    private List<DicBase> children = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public DicBase setId(Long id) {
        this.id = id;
		return this;
    }

    public String getCode() {
        return code;
    }

    public DicBase setCode(String code) {
        this.code = code == null ? null : code.trim();
		return this;
    }

    public String getDickey() {
        return dickey;
    }

    public DicBase setDickey(String dickey) {
        this.dickey = dickey == null ? null : dickey.trim();
		return this;
    }

    public String getDiccode() {
        return diccode;
    }

    public DicBase setDiccode(String diccode) {
        this.diccode = diccode == null ? null : diccode.trim();
		return this;
    }

    public String getName() {
        return name;
    }

    public DicBase setName(String name) {
        this.name = name == null ? null : name.trim();
		return this;
    }

    public String getPinyin() {
        return pinyin;
    }

    public DicBase setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
		return this;
    }

    public Integer getLevel() {
        return level;
    }

    public DicBase setLevel(Integer level) {
        this.level = level;
		return this;
    }

    public Integer getIdx() {
        return idx;
    }

    public DicBase setIdx(Integer idx) {
        this.idx = idx;
		return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public DicBase setEnable(Integer enable) {
        this.enable = enable;
		return this;
    }

    public Integer getDefaults() {
        return defaults;
    }

    public DicBase setDefaults(Integer defaults) {
        this.defaults = defaults;
		return this;
    }

    public String getRemark() {
        return remark;
    }

    public DicBase setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
		return this;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public DicBase setCreateBy(Long createBy) {
        this.createBy = createBy;
		return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public DicBase setCreateTime(Date createTime) {
        this.createTime = createTime;
		return this;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public DicBase setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
		return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public DicBase setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
		return this;
    }

    public List<DicBase> getChildren() {
        return children;
    }

    public DicBase setChildren(List<DicBase> children) {
        this.children = children;
        return  this;
    }
}
