package com.sankuai.yuan.service.impl;

import com.sankuai.yuan.service.IKnight;
import com.sankuai.yuan.service.IQuest;
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
public class BraveKnight implements IKnight {
    private IQuest quest;

    @Override
    public void embarkOnQuest() {
        quest.embark();
        System.out.println("hahahha");
    }
}
