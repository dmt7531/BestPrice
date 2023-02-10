package myapps.bestprice.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val exampleLiveDataMutable = MutableLiveData<String>()
    val exampleLiveData : LiveData<String> = exampleLiveDataMutable

}