package com.gefuxng.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author gefuxing
 * @create 2021/6/8 15:19
 */
@Log4j2
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${name}")
    private String name;

    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/config/info")
    public String getConfigInfo() {
        return name;
    }

    @GetMapping("/config/info/getfor")
    public int getfor() {
        String json = "{\n" +
                "    \"key\": 2,\n" +
                "    \"topic\": \"tra-tt\",\n" +
                "    \"value\": {\n" +
                "        \"isEndFlag\": false,\n" +
                "        \"frameId\": 7,\n" +
                "        \"vehicles\": [\n" +
                "            {\n" +
                "                \"acceleration\": 0,\n" +
                "                \"lane_info\": {\n" +
                "                    \"lane_dir\": true,\n" +
                "                    \"mesh_id\": 20597838,\n" +
                "                    \"lane_id\": 1711378\n" +
                "                },\n" +
                "                \"orient\": {\n" +
                "                    \"roll\": 0,\n" +
                "                    \"pitch\": 0.001473949218289591,\n" +
                "                    \"yaw\": 2.0376480394704606\n" +
                "                },\n" +
                "                \"pos\": {\n" +
                "                    \"x\": 116.24680431376134,\n" +
                "                    \"y\": 40.16273151086717,\n" +
                "                    \"z\": 36.42749724968254\n" +
                "                },\n" +
                "                \"entity_name\": \"1000001\",\n" +
                "                \"aggressiveness\": 0,\n" +
                "                \"name\": \"1\",\n" +
                "                \"longitude_speed\": 16.666666666666668,\n" +
                "                \"id\": 1000001,\n" +
                "                \"light_mask\": 0,\n" +
                "                \"wheel_angle\": 4.63557854729966e-310,\n" +
                "                \"driver_status\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"acceleration\": 0,\n" +
                "                \"lane_info\": {\n" +
                "                    \"lane_dir\": true,\n" +
                "                    \"mesh_id\": 20597838,\n" +
                "                    \"lane_id\": 1711376\n" +
                "                },\n" +
                "                \"orient\": {\n" +
                "                    \"roll\": 0,\n" +
                "                    \"pitch\": 0.0017234138405173367,\n" +
                "                    \"yaw\": 2.0373540494741103\n" +
                "                },\n" +
                "                \"pos\": {\n" +
                "                    \"x\": 116.24654840383639,\n" +
                "                    \"y\": 40.163040470868694,\n" +
                "                    \"z\": 36.45426845171697\n" +
                "                },\n" +
                "                \"entity_name\": \"0\",\n" +
                "                \"aggressiveness\": 0,\n" +
                "                \"name\": \"1\",\n" +
                "                \"longitude_speed\": 11.11111111111111,\n" +
                "                \"id\": 0,\n" +
                "                \"light_mask\": 0,\n" +
                "                \"wheel_angle\": 4.6355723038814e-310,\n" +
                "                \"driver_status\": 0\n" +
                "            }\n" +
                "        ],\n" +
                "        \"subTaskId\": \"0be8bb80-c186-4e69-b970-0c2efe0e83e6\",\n" +
                "        \"timestamp\": 27910.40992399999\n" +
                "    }\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject(json);

        int index = 0;
        for (int i = 0; i < 20000; i++) {
            jsonObject.put("key", i);
            jsonObject.put("frameId", i);
            JSONObject jsonObject1 = restTemplate.postForObject("http://10.130.20.230:31863/simulation/api/v1/kafka/produce", jsonObject, JSONObject.class);
            log.info(jsonObject1.toJSONString() + "传递次数" + i);
            index = i;
        }
        return index;
    }
}

