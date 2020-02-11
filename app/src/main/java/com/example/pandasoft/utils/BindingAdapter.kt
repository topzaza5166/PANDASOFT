package com.example.pandasoft.utils

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

object BindingAdapter {

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    @BindingAdapter("data")
    fun <T> setRecyclerViewProperties(recycleListView: RecyclerView, items: T) {
        if (recycleListView.adapter is BindableAdapter<*>)
            (recycleListView.adapter as BindableAdapter<T>).setData(items)
    }

    @JvmStatic
    @BindingAdapter("loadImage")
    fun loadImage(view: ImageView, url: String?) {
        url?.let { Glide.with(view).load(it).into(view) }
    }

}