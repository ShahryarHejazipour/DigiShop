package com.tispunshahryar960103.digishop.ui.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.tispunshahryar960103.digishop.R
import com.tispunshahryar960103.digishop.databinding.RowProductBinding
import com.tispunshahryar960103.digishop.models.Product

class ProductAdapter(private val productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {

        val binding: RowProductBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.row_product, parent, false
        )
        return ProductVH(binding)
    }

    override fun onBindViewHolder(holder: ProductVH, position: Int) {

        val product = productList[position]

        holder.binding.product = product


    }

    override fun getItemCount(): Int {
        return productList.size

    }


    class ProductVH(val binding: RowProductBinding) : RecyclerView.ViewHolder(binding.root)
}