package com.project.flyGame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;

public class Background {

    int x = 0, y = 0;
    Bitmap background;

    Background(int screenX, int screenY, Resources res, int data) {

        background = BitmapFactory.decodeResource(res, data);
        background = Bitmap.createScaledBitmap(background, screenX, screenY, false);

    }

}
