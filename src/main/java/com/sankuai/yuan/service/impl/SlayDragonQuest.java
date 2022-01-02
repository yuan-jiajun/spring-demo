package com.sankuai.yuan.service.impl;

import com.sankuai.yuan.service.IQuest;

import java.io.PrintStream;

/**
 * 杀死暴龙行动
 * Created by lidawei on 2017/4/5.
 */

public class SlayDragonQuest implements IQuest {
    private final PrintStream printStream;


    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on quest to slay a dragon!");
    }
}
