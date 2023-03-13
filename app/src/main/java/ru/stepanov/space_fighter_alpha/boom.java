package ru.stepanov.space_fighter_alpha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class boom {
    private static Bitmap bitmap;
    public boom(Context context) {
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.boom);
    }
    public static Bitmap getBitmap() {
        return bitmap;
    }
}