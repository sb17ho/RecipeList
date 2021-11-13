package com.example.todo.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.todo.data.Task

class ItemsListDiffUtil(
    private val oldList: List<Task>,
    private val newList: List<Task>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition] === newList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition].id == newList[newItemPosition].id &&
                oldList[oldItemPosition].title == newList[newItemPosition].title &&
                oldList[oldItemPosition].description == newList[newItemPosition].description &&
                oldList[oldItemPosition].priority == newList[newItemPosition].priority &&
                oldList[oldItemPosition].dd == newList[newItemPosition].dd &&
                oldList[oldItemPosition].mm == newList[newItemPosition].mm &&
                oldList[oldItemPosition].yy == newList[newItemPosition].yy
}