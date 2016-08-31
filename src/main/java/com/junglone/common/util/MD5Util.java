package com.junglone.common.util;

import java.security.MessageDigest;

public class MD5Util {
    private static final String ENCRY_MONDEL = "MD5";

    /**
     * Description: 取得32位md5加密结果.
     *
     * @param strData 加密内容
     *
     * @return 加密结果
     */
    public static String md5(String strData) {
        if (StringUtil.isBlank(strData)) {
            return strData;
        }
        return encrypt(strData);
    }

    // 得到加密后的字符
    private static String encrypt(String strData) {
        try {
            MessageDigest md = MessageDigest.getInstance(ENCRY_MONDEL);
            md.update(strData.getBytes());
            StringBuffer sb = new StringBuffer();
            byte[] bytes = md.digest();
            for (int i = 0; i < bytes.length; i++) {
                int b = bytes[i] & 0xFF;
                if (b < 0x10) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(b));
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static void main(String args[]) {
        System.out.println(md5("abc123@").equals("0d7f943d633e49fb06fe6c53acabe3c5"));
    }
}
