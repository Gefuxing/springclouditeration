package com.gefuxing.service.Impl;

import com.gefuxing.service.mqservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.binding.BinderAwareChannelResolver;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author gefuxing
 * @create 2021/6/3 11:17
 */
@EnableBinding(Source.class)
public class mqserviceImpl implements mqservice {

    @Resource
    private MessageChannel output;

    @Autowired
    private BinderAwareChannelResolver resolver;
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        String string = "{\n" +
                "    \"key\": 1427,\n" +
                "    \"topic\": \"test-topic1dfg\",\n" +
                "    \"value\": {\n" +
                "        \"isEndFlag\": false,\n" +
                "        \"frameId\": 1,\n" +
                "        \"vehicles\": [\n" +
                "            {\n" +
                "                \"acceleration\": -0.43390016070788306,\n" +
                "                \"lane_info\": {\n" +
                "                    \"lane_dir\": true,\n" +
                "                    \"mesh_id\": 20134309,\n" +
                "                    \"lane_id\": 8471\n" +
                "                }\n" +
                "            }\n" +
                "        ],\n" +
                "        \"subTaskId\": \"fd8eb903-35e5-4347-9c7d-4857e69a4d2f\",\n" +
                "        \"timestamp\": 1622796141.9415636\n" +
                "    }\n" +
                "}";
        long start = System.currentTimeMillis();

        //output.send(MessageBuilder.withPayload(string).build());

        resolver.resolveDestination("pgfx").send(MessageBuilder.withPayload(string).build());
        long end = System.currentTimeMillis();
        System.out.println("*****serial: "+serial+"--------------"+(end-start));
        return "ok";
    }

    @Override
    public String getName(String name) {

        return  name;
    }

}
