package com.dcm.more_ds.vo;

import com.dcm.more_ds.constant.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApiModel(description = "字典表视图")
public class DicBaseVO extends BaseModel<DicBaseVO> {
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

    /** 下一级字典项集合 */
    @ApiModelProperty(value = "下一级字典项集合")
    private List<DicBaseVO> children = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public DicBaseVO setId(Long id) {
        this.id = id;
		return this;
    }

    public String getCode() {
        return code;
    }

    public DicBaseVO setCode(String code) {
        this.code = code == null ? null : code.trim();
		return this;
    }

    public String getDickey() {
        return dickey;
    }

    public DicBaseVO setDickey(String dickey) {
        this.dickey = dickey == null ? null : dickey.trim();
		return this;
    }

    public String getDiccode() {
        return diccode;
    }

    public DicBaseVO setDiccode(String diccode) {
        this.diccode = diccode == null ? null : diccode.trim();
		return this;
    }

    public String getName() {
        return name;
    }

    public DicBaseVO setName(String name) {
        this.name = name == null ? null : name.trim();
		return this;
    }

    public String getPinyin() {
        return pinyin;
    }

    public DicBaseVO setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
		return this;
    }

    public Integer getLevel() {
        return level;
    }

    public DicBaseVO setLevel(Integer level) {
        this.level = level;
		return this;
    }

    public List<DicBaseVO> getChildren() {
        return children;
    }

    public DicBaseVO setChildren(List<DicBaseVO> children) {
        this.children = children;
        return  this;
    }
}
