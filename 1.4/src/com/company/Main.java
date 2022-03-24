package com.company;

public class Main {
    public static int[] crc_table = new int[256];
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 256; ++i) {
            int code = i;
            for (j = 0; j < 8; ++j) {
                code = (code & 0x01) == 1 ? (0xEDB88320^ (code >>> 1)) : (code >>> 1);
            }
            crc_table[i] = code;
        }
        System.out.println(crc32("This is example text ..."));
    }
    public static int crc32(String text){
        int i;
        int crc = -1;
        for(i = 0; i < text.length(); ++i){
            int code = Character.codePointAt(text, i);
            crc = crc_table[(code ^ crc) & 0xFF] ^ (crc >>> 8);
        }
        return ((-1 ^ crc) >>> 0);
    }
}
