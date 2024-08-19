package com.cleancodepractice.presentation.di

import com.cleancodepractice.presentation.activity.MainViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            getNameUseCase = get(),
            saveNameUseCase = get()
        )
    }

}