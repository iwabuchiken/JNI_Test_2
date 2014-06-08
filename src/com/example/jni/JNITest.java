package com.example.jni;

public class JNITest {

	static {  
        // load library  
//        System.loadLibrary("JNI_Library");  
        System.loadLibrary("hello");  
    }  
  
    public static void main(final String[] args) {
    	
    	_test();
    	
        new JNITest().hello("world");  
    }  
  
    private static void _test() {
	// TODO Auto-generated method stub
    	System.out.println(System.getProperty("java.library.path"));
    	
    }

	// native method signature  
    public native void hello(String name);
    
}
