#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_tispunshahryar960103_digishop_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Welcome To DigiShop";
    return env->NewStringUTF(hello.c_str());
}


extern "C" JNIEXPORT jstring JNICALL
Java_com_tispunshahryar960103_digishop_di_module_RetrofitModule_baseApiUrl(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "https://androidsupport.ir/pack/digiAndroid/";
    return env->NewStringUTF(hello.c_str());
}