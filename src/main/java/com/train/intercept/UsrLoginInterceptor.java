package com.train.intercept;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.train.action.LoginAction;

public class UsrLoginInterceptor extends AbstractInterceptor {

    public String intercept(ActionInvocation arg0) throws Exception {
         // �ж��Ƿ�����Ϊ��¼����(login),�����������
        if (LoginAction.class == arg0.getAction().getClass())
             return arg0.invoke();
        
       // �������������ҳ�棬��������
         Map map = arg0.getInvocationContext().getSession();
        String[] users = (String[])arg0.getInvocationContext().getParameters().get("username");
        String username = users[0];
         if (null == map.get(username))
             return Action.LOGIN;
 
         return arg0.invoke();
     }
}