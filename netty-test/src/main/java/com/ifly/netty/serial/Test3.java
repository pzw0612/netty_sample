package com.ifly.netty.serial;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int  id =101;
        int  age =21;

        ChannelBuffer channelBuffer = ChannelBuffers.dynamicBuffer();
        channelBuffer.writeInt(id);
        channelBuffer.writeInt(age);

        byte[] bytes = new byte[channelBuffer.writerIndex()];
        channelBuffer.readBytes(bytes);

        System.out.println(Arrays.toString(bytes));

        ChannelBuffer channelBuffer2 = ChannelBuffers.wrappedBuffer(bytes);
        System.out.println("id="+ channelBuffer2.readInt());
        System.out.println("age="+ channelBuffer2.readInt());
    }
}
