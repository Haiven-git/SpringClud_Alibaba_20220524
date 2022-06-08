package com.zhf.clud.springclud_alibaba_20220524.person;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {

    @SentinelResource(value = "getPerson",blockHandler = "getPersonBack")
    public String getPerson(){
        return  "Success!";
    }

    public String getPersonBack(BlockException exception) {

        return  "GetPersonBack!";
    }
}
