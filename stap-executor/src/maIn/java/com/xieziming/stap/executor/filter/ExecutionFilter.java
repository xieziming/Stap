package com.xieziming.stap.executor.filter;

import com.xieziming.stap.core.execution.raw.RawExecution;

/**
 * Created by Suny on 5/21/16.
 */
public interface ExecutionFilter {
    public boolean shouldBeExecuted(RawExecution execution);
}
