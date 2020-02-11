package com.example.pandasoft.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pandasoft.utils.TextWatcherAdapter

class LoginViewModel : ViewModel() {

    val userName:MutableLiveData<String> = MutableLiveData()
    val userNameChange = TextWatcherAdapter {
        userName.value = it
    }

    val password:MutableLiveData<String> = MutableLiveData()
    val passwordChange = TextWatcherAdapter {
        password.value = it
    }
}