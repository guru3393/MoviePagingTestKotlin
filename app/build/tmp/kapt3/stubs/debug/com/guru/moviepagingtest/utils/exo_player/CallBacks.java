package com.guru.moviepagingtest.utils.exo_player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/guru/moviepagingtest/utils/exo_player/CallBacks;", "", "onItemClickCallBack", "", "albumId", "", "(Ljava/lang/Integer;)V", "onPlayingEnd", "app_debug"})
public abstract interface CallBacks {
    
    public abstract void onItemClickCallBack(@org.jetbrains.annotations.Nullable()
    java.lang.Integer albumId);
    
    public abstract void onPlayingEnd();
}