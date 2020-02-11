package com.example.pandasoft.ui.detail

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.pandasoft.data.model.News
import com.example.pandasoft.data.model.NewsList
import java.text.SimpleDateFormat
import java.util.*

class DetailViewModel : ViewModel() {

    val data: MutableLiveData<News> = MutableLiveData()

    @SuppressLint("SimpleDateFormat")
    val date: LiveData<String> = Transformations.map(data) {
        SimpleDateFormat("dd/MM/yyyy").format(Date(it.create.toLong()))
    }
}