package com.trl.chapter_10.timer;

import javax.annotation.Resource;
import javax.ejb.*;

public class SimpleProgramaticTimer4 {
    @Resource
    TimerService timerService;

    public void setTimer() {
        ScheduleExpression expression = new ScheduleExpression();
        expression.second("*/10").minute("*").hour("*");
        Timer timer = timerService.createCalendarTimer(new ScheduleExpression()
                .second("*/10").minute("*").hour("*"));
    }

    @Timeout
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void performTask() {
        System.out.println("Simple Task performed");
    }
}