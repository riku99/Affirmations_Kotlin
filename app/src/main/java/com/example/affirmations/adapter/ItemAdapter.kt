package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    // ItemAdapterからのみ使用されることをネストさせることで示すことができる
    //  ViewHolderはRecyclerView内の1つのリストの項目ビューを表す
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // parent: リスト項目ビューが子としてアタッチされるViewGroup。これの親はRecyclerView
    // 実際に新たなviewを作成。list_itemレイアウトをビューオブジェクトにインフレートする
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // アイテムとViewHolderがバインドされたタイミングでビューの内容更新
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

//    override fun getItemCount(): Int {
//        return dataset.size
//    }
    override fun getItemCount() = dataset.size
}