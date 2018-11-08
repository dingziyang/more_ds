package com.dcm.more_ds.constant;

/**
 * @PackageName: com.dcm.more_ds.constant
 * @ClassName: ResultCode
 * @Description: 返回结果状态码和提示信息
 * @Auther: dcm
 * @Date: 2018-6-1 16:30
 */

public class ResultCode {

    /**正常*/
    public static int BIGJUD_200 = 200;

    /**表单校验不通过*/
    public static int BIGJUD_400 = 400;

    /**鉴权不通过*/
    public static int BIGJUD_401 = 401;

    /**权限不够*/
    public static int BIGJUD_403 = 403;

    /**信息缺失*/
    public static int BIGJUD_405 = 405;

    /**服务器异常*/
    public static int BIGJUD_500 = 500;

    /**成功的提示信息*/
    public static String BIGJUD_SUCCESS = "success";

    /**错误请求的提示信息*/
    public static String BIGJUD_BAD_REQUEST = "Bad Request";

    /**错误的操作行为*/
    public static int BIGJUD_501 = 501;


}
