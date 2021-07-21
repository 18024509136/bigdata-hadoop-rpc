package com.geek;

import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

@Slf4j
public class StudentManagerImpl implements StudentManager {
    @Override
    public String findName(long studentId) {
        String name = studentId == 20210123456789L ? "心心" : null;
        log.info("服务端接收到的内容为：{}，响应内容为：{}", studentId, name);
        return name;
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }
}
