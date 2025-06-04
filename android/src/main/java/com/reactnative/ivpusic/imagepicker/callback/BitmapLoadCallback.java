package com.reactnative.ivpusic.imagepicker.callback;

import android.graphics.Bitmap;
import android.net.Uri;

import com.reactnative.ivpusic.imagepicker.model.ExifInfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface BitmapLoadCallback {

    void onBitmapLoaded(@NonNull Bitmap bitmap, @NonNull ExifInfo exifInfo, @NonNull Uri imageInputUri, @Nullable Uri imageOutputUri);

    void onFailure(@NonNull Exception bitmapWorkerException);

}