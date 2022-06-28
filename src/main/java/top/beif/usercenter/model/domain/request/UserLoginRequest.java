package top.beif.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author 16116
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 4085937408725161956L;
    private String userAccount;
    private String userPassword;
}
