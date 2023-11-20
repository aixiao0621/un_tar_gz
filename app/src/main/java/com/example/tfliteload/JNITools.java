package com.example.tfliteload;

public class JNITools {
    static {
        System.loadLibrary("native-lib");
    }
    public native byte[] extractTarGz(String filePath);
}
