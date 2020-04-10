package com.csc.rpc.rpcframe.bean;

import java.io.Serializable;

/**
 * @Description
 * @Author Link.Chen
 * @Date2020/4/8 17:17
 **/
public class RpcRequest implements Serializable {

    private static final long serialVersionUID = -7673795751109102084L;

    private String className;

    private String methodName;

    private Object[] parameters;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
