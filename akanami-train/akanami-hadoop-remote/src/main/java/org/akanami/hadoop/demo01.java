package org.akanami.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class demo01 {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://49.234.38.24:9000");
        conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");
        conf.set("dfs.client.block.write.replace-datanode-on-failure.policy", "NEVER");
        FileSystem fs = FileSystem.get(conf);

        Path path = new Path("/hdfs/demo1/my.txt");
        FSDataOutputStream fout = fs.create(path);
        byte[] bWrite = "hello world".getBytes();
        fout.write(bWrite);
        fout.flush();

        fout.close();

        FSDataInputStream fin = fs.open(path);
        byte[] buff = new byte[128];
        int len = 0;

        while((len = fin.read(buff, 0, 128)) != -1) {
            System.out.println(new String(buff, 0, len));
        }

        System.out.println("write read");
    }
}
