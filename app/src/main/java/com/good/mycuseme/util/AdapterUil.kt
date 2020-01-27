package com.good.mycuseme.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.good.mycuseme.base.BaseRecyclerViewAdapter

@BindingAdapter("setImage")
fun setImageUrl(view: ImageView, profile: String?) {
    Glide.with(view.context)
        .load(profile)
        .into(view)
}

@BindingAdapter(value = ["replaceAll"])
fun RecyclerView.replaceAll(list: List<Any>?) {
    @Suppress("UNCHECKED_CAST")
    (this.adapter as? BaseRecyclerViewAdapter<Any, *>)?.run {
        replaceAll(list)
        notifyDataSetChanged()
    }
}
