package com.ifly.netty.serial;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;


public class Test1 {
    public static void main(String[] args) throws Exception {

        int  id =101;
        int  age =21;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(int2byte(id));
        outputStream.write(int2byte(age));

        byte[] bytes = outputStream.toByteArray();
        System.out.println(Arrays.toString(bytes));
        //==========================================
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        byte[] idbyte =new byte[4];
        byteArrayInputStream.read(idbyte);
        System.out.println("id="+ byte2int(idbyte));

        byte[] agebyte =new byte[4];
        byteArrayInputStream.read(agebyte);
        System.out.println("age="+ byte2int(agebyte));



    }

    /**
     * 高端-系列化
     * @param intdata
     * @return
     */
    public static byte[] int2byte(int intdata){
        byte [] bytes = new byte[4];
        bytes[0]=(byte)(intdata>>3*8);
        bytes[1]=(byte)(intdata>>2*8);
        bytes[2]=(byte)(intdata>>1*8);
        bytes[3]=(byte)(intdata>>0*8);
        return  bytes;
    }

    /**
     * 高端-反系列化
     * @param bytes
     * @return
     */
    public static  int  byte2int(byte[] bytes){
        return  (bytes[0]<<3*8)|
                (bytes[1]<<2*8)|
                (bytes[2]<<1*8)|
                (bytes[3]<<0*8);
    }
}
