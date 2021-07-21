package com.geek;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

@Slf4j
public class RpcClient {

    public static void main(String[] args) {
        try {
            StudentManager proxy = RPC.getProxy(StudentManager.class, 1L, new InetSocketAddress("127.0.0.1", 8088), new Configuration());

            String name1 = proxy.findName(20210123456789L);
            log.info("服务器返回：{}", name1);
            String name2 = proxy.findName(20210000000000L);
            log.info("服务器返回：{}", name2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
