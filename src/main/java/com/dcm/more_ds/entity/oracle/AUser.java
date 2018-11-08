package com.dcm.more_ds.entity.oracle;

import com.dcm.more_ds.constant.base.BaseModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

/**
  * @author dcm
  * @date 2018-9-10 15:47
  * @Description: 用户
  * @return
  * @throws
  */
public class AUser extends BaseModel<AUser> {
    private static final long serialVersionUID = 7137144238897742904L;

    @ApiModelProperty("主键uuid")
    private String id;

    @ApiModelProperty("用户名")
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty("昵称")
    @NotEmpty(message = "用户昵称不能为空")
    private String nickname;

    @ApiModelProperty("密码")
    @NotEmpty(message = "密码")
    @Length(max = 40, min = 5, message = "密码最大长度40个字符,最小长度5个字符")
    private String pwd;

    @ApiModelProperty("性别(0-女，1男)")
    @Min(value = 0, message = "性别只能是0或1")
    @Max(value = 1, message = "性别只能是0或1")
    private BigDecimal sex;

    @ApiModelProperty("出生日期")
    private Date csrq;

    @ApiModelProperty("身份证号")
    private String sfzh;

    @ApiModelProperty("地址")
    private String addr;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("座机号")
    private String phone;

    @ApiModelProperty("启用？(0-false,1-true)")
    @Min(value = 0, message = "启用？只能是0或1")
    @Max(value = 1, message = "启用？只能是0或1")
    private BigDecimal enabled;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty("修改时间")
    private Date updateTime;

    @ApiModelProperty("修改人")
    private String updateBy;

    public String getId() {
        return id;
    }

    public AUser setId(String id) {
        this.id = id == null ? null : id.trim();
		return this;
    }

    public String getUsername() {
        return username;
    }

    public AUser setUsername(String username) {
        this.username = username == null ? null : username.trim();
		return this;
    }

    public String getNickname() {
        return nickname;
    }

    public AUser setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
		return this;
    }

    public String getPwd() {
        return pwd;
    }

    public AUser setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
		return this;
    }

    public BigDecimal getSex() {
        return sex;
    }

    public AUser setSex(BigDecimal sex) {
        this.sex = sex;
		return this;
    }

    public Date getCsrq() {
        return csrq;
    }

    public AUser setCsrq(Date csrq) {
        this.csrq = csrq;
		return this;
    }

    public String getSfzh() {
        return sfzh;
    }

    public AUser setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
		return this;
    }

    public String getAddr() {
        return addr;
    }

    public AUser setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
		return this;
    }

    public String getMobile() {
        return mobile;
    }

    public AUser setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
		return this;
    }

    public String getPhone() {
        return phone;
    }

    public AUser setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
		return this;
    }

    public BigDecimal getEnabled() {
        return enabled;
    }

    public AUser setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
		return this;
    }

    public String getRemark() {
        return remark;
    }

    public AUser setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
		return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AUser setCreateTime(Date createTime) {
        this.createTime = createTime;
		return this;
    }

    public String getCreateBy() {
        return createBy;
    }

    public AUser setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
		return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public AUser setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
		return this;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public AUser setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
		return this;
    }
}
