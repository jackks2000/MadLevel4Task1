package com.example.madlevel4task1.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel4task1.Model.Product
import com.example.madlevel4task1.R
import com.example.madlevel4task1.databinding.FragmentProductBinding

class ProductAdapter(private val products: List<Product>):
RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        private val binding = FragmentProductBinding.bind(itemView)

        fun dataBind(product:Product){
            binding.tvProductName.text = product.name
            binding.tvAmount.text = product.amount.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_product, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }
}