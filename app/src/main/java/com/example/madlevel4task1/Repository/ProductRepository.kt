package com.example.madlevel4task1.Repository

import android.content.Context
import com.example.madlevel4task1.DOA.ProductDAO
import com.example.madlevel4task1.Database.ShoppingListRoomDatabase
import com.example.madlevel4task1.Model.Product

class ProductRepository(context: Context) {

    private val productDAO: ProductDAO

    init {
        val database = ShoppingListRoomDatabase.getDatabase(context)
        productDAO = database!!.productDao()
    }

    suspend fun getAllProducts(): List<Product> {
        return productDAO.getAllProducts()
    }

    suspend fun insertProduct(product: Product) {
        productDAO.insertProduct(product)
    }

    suspend fun deleteProduct(product: Product) {
        productDAO.deleteProduct(product)
    }

    suspend fun deleteAllProducts() {
        productDAO.deleteAllProducts()
    }

}
