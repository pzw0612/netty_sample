package com.ifly.netty.serial;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int  id =101;
        int  age =21;

        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putInt(id);
        byteBuffer.putInt(age);

        byte[] arr = byteBuffer.array();
        System.out.println(Arrays.toString(arr));

        //   #########################################################
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(arr);
        System.out.println("id="+ byteBuffer2.getInt());
        System.out.println("age="+byteBuffer2.getInt());


    }
}
