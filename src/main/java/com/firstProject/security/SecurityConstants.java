package com.firstProject.security;

import com.firstProject.SpringApplicationContext;

public class SecurityConstants { // 로그인시 사용자 인증 토큰 필터에서 사용되는 요소들을 보관
	
	public static final long EXPIRATION_TIME = 864000000; // milliseconds, token valid for 10 days
    public static final String TOKEN_PREFIX = "Bearer "; // will be passed on togetehr with header string in http request
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    
    public static String getTokenSecret()
    {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }
}
