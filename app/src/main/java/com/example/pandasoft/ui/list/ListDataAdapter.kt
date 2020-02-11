package com.example.pandasoft.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pandasoft.data.model.News
import com.example.pandasoft.databinding.FragmentListBinding
import com.example.pandasoft.databinding.ListItemBinding
import com.example.pandasoft.utils.BindableAdapter


class ListDataAdapter : ListAdapter<News, ListDataAdapter.ViewHolder>(DiffCallback()),
    BindableAdapter<List<News>> {

    override fun setData(data: List<News>?) {
        submitList(data)
    }

    class DiffCallback : DiffUtil.ItemCallback<News>() {
        override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
            return oldItem.uuid == newItem.uuid
        }

        override fun areContentsTheSame(oldItem: News, newItem: News): Boolean {
            return oldItem.title == newItem.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: News) {
            binding.data = item
        }
    }

}