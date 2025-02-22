# MyMoneyManager/app/proguard-rules.pro

# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /usr/share/android-sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the ProGuard
# include property in project.properties.

# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project-specific keep rules here:
# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to be preserved.
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# TensorFlow Lite
-keep class org.tensorflow.** { *; }
-keep class org.tensorflow.lite.** { *; }
