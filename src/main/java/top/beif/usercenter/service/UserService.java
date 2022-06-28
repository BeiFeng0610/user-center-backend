package top.beif.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.beif.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 16116
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2022-06-24 21:45:24
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);


    /**
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);
}
