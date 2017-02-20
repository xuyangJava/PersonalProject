package com.sipingsoft.office.core.orm;

import org.apache.ibatis.executor.resultset.FastResultSetHandler;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.RowBounds;

/**
 * 逻辑分页：
 * 在DefaultResultSetHandler中，逻辑分页会将所有的结果都查询到，然后根据RowBounds中提供的offset和limit值来获取最后的结果
 **/
//@Intercepts({ @Signature(type = ResultSetHandler.class, method = "handleResultSets", args = { Statement.class }) })
public class PaginationResultSetHandlerInterceptor/* implements Interceptor*/ {

    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();

    public Object intercept(Invocation invocation) throws Throwable {
        FastResultSetHandler resultSetHandler = (FastResultSetHandler) invocation.getTarget();
        MetaObject metaStatementHandler = MetaObject.forObject(resultSetHandler, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
        RowBounds rowBounds = (RowBounds) metaStatementHandler.getValue("rowBounds");

        Object result = invocation.proceed();

        if (rowBounds instanceof Page) {
            metaStatementHandler.setValue("rowBounds.result", result);
        }
        return result;
    }

    /*public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
    }
*/
}
