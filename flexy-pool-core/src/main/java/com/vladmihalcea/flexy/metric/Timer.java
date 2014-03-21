package com.vladmihalcea.flexy.metric;

import java.util.concurrent.TimeUnit;

/**
 * <code>Timer</code> defines the basic Timer behavior..
 *
 * @author Vlad Mihalcea
 * @version    %I%, %E%
 * @since 1.0
 */
public interface Timer {

    /**
     * Update the timer with the given snapshot duration
     * @param duration snapshot duration
     * @param unit time unit
     */
   void update(long duration, TimeUnit unit);
}
