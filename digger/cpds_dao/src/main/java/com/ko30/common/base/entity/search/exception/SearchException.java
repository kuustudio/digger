package com.ko30.common.base.entity.search.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * <p>User: pengxinxin
 * <p>Date: 13-1-17 上午11:43
 * <p>Version: 1.0
 */
public class SearchException extends NestedRuntimeException {

    public SearchException(String msg) {
        super(msg);
    }

    public SearchException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
