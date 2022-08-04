package com.github.derleymad.jokerapp.view

import android.view.TextureView
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.github.derleymad.jokerapp.R
import com.github.derleymad.jokerapp.model.Category
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class CategoryItem(private val categories: Category) : Item<CategoryItem.CategoryViewHolder>() {
    class CategoryViewHolder(view: View) : GroupieViewHolder(view)

    override fun createViewHolder(itemView: View): CategoryViewHolder {
        return CategoryViewHolder((itemView))
    }

    override fun bind(viewHolder: CategoryViewHolder, position: Int) {
        val txtCategory = viewHolder.itemView.findViewById<TextView>(R.id.txt_category)
        val containerCategory = viewHolder.itemView.findViewById<LinearLayout>(R.id.container_category)

        txtCategory.text =  categories.name
        containerCategory.setBackgroundColor(categories.bgColor.toInt())
    }

    override fun getLayout(): Int {
        return R.layout.item_category
    }
}