package com.emall.interceptor;

import com.emall.common.Const;
import com.emall.response.CommonReturnType;
import com.emall.utils.CookieUtil;
import com.emall.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 * Created by kimvra on 2018/12/27
 */
@Slf4j
@Component
public class AuthorityInterceptor implements HandlerInterceptor {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandler");
        String loginToken = CookieUtil.readLoginToken(request);

        PrintWriter writer = null;
        if (StringUtils.isBlank(loginToken)) {
            response.reset();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            writer = response.getWriter();
            writer.print(JsonUtil.obj2String(CommonReturnType.create("拦截用户未登录", "fail")));
            writer.flush();
            writer.close();
            return false;
        }
        String userId = redisTemplate.opsForValue().get(loginToken);
        if (StringUtils.isBlank(userId)) {
            response.reset();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            writer = response.getWriter();
            writer.print(JsonUtil.obj2String(CommonReturnType.create("拦截用户未登录", "fail")));
            writer.flush();
            writer.close();
            return false;
        }
        redisTemplate.expire(loginToken, Const.REDIS_SESSION_EXPIRETIME, TimeUnit.SECONDS);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
