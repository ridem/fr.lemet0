/*package fr.lemet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;

import org.hsqldb.server.Servlet;

public class ChargeurImage extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        ImageSize targetSize = new ImageSize(120, 80); // result Bitmap will be fit to this size
        imageLoader.loadImage(imageUri, targetSize, displayOptions, new SimpleImageLoadingListener() {
            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                // Do whatever you want with Bitmap
            }
        });

        // Create global configuration and initialize ImageLoader with this configuration
        ImageLoaderConfiguration config = new ImageLoaderConfiguration(getApplicationContext());
        .cacheInMemory()
        .cacheOnDisc()

        build();
        ImageLoader.getInstance().init(config);
    }
}

//"Using Universal Image Loader (c) 2011-2013, Sergey Tarasevich"*/