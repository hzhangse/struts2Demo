package com.train.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	public void destroy() {

		System.out.println("destroy");
	}

	public void init() {

		System.out.println("�������Ѿ�������");
	}

	public String intercept(ActionInvocation invocation) throws Exception {

		System.out.println("����intercept����");

		String result = invocation.invoke(); // invocation.invoke������������Ƿ���������
												// �еĻ������������µ������� û����
												// ִ��action��ҵ���߼�
		return result;
	}

}