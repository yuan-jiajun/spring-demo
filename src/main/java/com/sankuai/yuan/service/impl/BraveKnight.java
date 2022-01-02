package com.sankuai.yuan.service.impl;

import com.sankuai.yuan.service.Knight;
import com.sankuai.yuan.service.Quest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 勇敢的骑士
 * Created by lidawei on 2017/4/5.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BraveKnight implements Knight {
    private Quest quest;

    @Override
    public void embarkOnQuest() {
        quest.embark();
        System.out.println("hahahha");
    }
}
