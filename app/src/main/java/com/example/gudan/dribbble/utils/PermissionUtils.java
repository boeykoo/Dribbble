package com.example.gudan.dribbble.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

public class PermissionUtils {

    public static final int REQ_CODE_WRITE_EXTERNAL_STORAGE = 101;

    public static boolean checkPermission(@NonNull Context context,
                                          @NonNull String permission) {
        return ContextCompat.checkSelfPermission(context, permission)
                == PackageManager.PERMISSION_GRANTED;
    }

    public static boolean checkWriteExternalStoragePermission(@NonNull Context context) {
        return checkPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    }

    public static void requestPermissions(@NonNull Activity activity,
                                          @NonNull String[] permissions,
                                          int reqCode) {
        ActivityCompat.requestPermissions(activity, permissions, reqCode);
    }

    public static void requestWriteExternalStoragePermission(@NonNull Activity activity) {
        requestPermissions(activity,
                           new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE},
                           REQ_CODE_WRITE_EXTERNAL_STORAGE);
    }
}
