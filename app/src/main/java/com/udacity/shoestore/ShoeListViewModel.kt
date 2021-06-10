package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import java.util.*

class ShoeListViewModel : ViewModel() {
    private val _shoes = MutableLiveData<List<Shoe>>()
    val shoes : LiveData<List<Shoe>> get() = _shoes
    private val list : MutableList<Shoe> = LinkedList()
    fun addShoe(shoe : Shoe){
        list.add(shoe)
        _shoes.value = list
    }
}