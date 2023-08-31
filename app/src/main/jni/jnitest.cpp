#include <jnitest.h>
#include <iostream>

JNIEXPORT jint JNICALL Java_com_example_test_1ndk_MainActivity_getSum
(JNIEnv *env, jobject thiz, jint num1, jint num2) {




    return num1 + num2;

}