package com.example.quwiclient.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.widget.ImageView;

import androidx.core.content.res.ResourcesCompat;

import com.amulyakhare.textdrawable.TextDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.example.quwiclient.R;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public final class BindingUtils {

    private BindingUtils() {
        // This class is not publicly instantiable
    }

    public static void setImageUrl(ImageView imageView, String url, String name) {
        Context context = imageView.getContext();
        Typeface typeface = ResourcesCompat.getFont(context, R.font.google_sans_bold);
        if (url == null) {
            // Generate a random color based on the name
            int color = getRandomColor(name);

            // Create a new Bitmap with a solid color background
            Bitmap bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setColor(color);
            canvas.drawCircle(50, 50, 50, paint);

            // Add the first letter of the name to the center of the image
            Paint textPaint = new Paint();
            textPaint.setColor(Color.WHITE);
            textPaint.setTextSize(40);
            textPaint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(name.substring(0, 1), 50, 60, textPaint);

            // Load the bitmap into the ImageView using Glide
            Glide.with(imageView.getContext())
                    .load(bitmap)
                    .apply(RequestOptions.circleCropTransform())
                    .into(imageView);
        } else {
            Glide.with(imageView.getContext())
                    .load(url)
                    .apply(RequestOptions.circleCropTransform())
                    .into(imageView);
        }

    }


    private static int getRandomColor(String name) {
        Random random = new Random(name.hashCode());
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }


    public static String transformDateForChat(String dateTimeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);

        String displayTime;
        if (dateTime.toLocalDate().equals(LocalDate.now())) {
            // if date is today, show time in format '11:22'
            displayTime = dateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        } else {
            // if date is not today, show just date like '27 Feb'
            displayTime = dateTime.format(DateTimeFormatter.ofPattern("d MMM"));
        }
        return displayTime;
    }
}
