package top.beif.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author 16116
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 5847960624353686690L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
