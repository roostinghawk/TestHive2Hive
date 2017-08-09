package com.leadingsoft.liuw;

import org.hive2hive.core.api.H2HNode;
import org.hive2hive.core.api.configs.FileConfiguration;
import org.hive2hive.core.api.configs.NetworkConfiguration;
import org.hive2hive.core.api.interfaces.IFileConfiguration;
import org.hive2hive.core.api.interfaces.IH2HNode;
import org.hive2hive.core.api.interfaces.INetworkConfiguration;

import java.net.Inet4Address;

/**
 * Created by admin on 2017/8/9.
 */
public class Main {

    public static void main(String args[]) {
        INetworkConfiguration netConfig = NetworkConfiguration.createInitial("first");
        IFileConfiguration fileConfig = FileConfiguration.createDefault();

        IH2HNode peerNode = H2HNode.createNode(fileConfig);
        peerNode.connect(netConfig);
    }
}
