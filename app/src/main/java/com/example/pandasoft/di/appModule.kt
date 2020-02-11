package com.example.pandasoft.di

import com.example.pandasoft.ui.detail.DetailViewModel
import com.example.pandasoft.ui.list.ListViewModel
import com.example.pandasoft.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { ListViewModel() }

    viewModel { LoginViewModel() }

    viewModel { DetailViewModel() }
}