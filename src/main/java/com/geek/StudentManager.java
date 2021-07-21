package com.geek;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface StudentManager extends VersionedProtocol {

    long versionID = 1L;

    String findName(long studentId);
}
