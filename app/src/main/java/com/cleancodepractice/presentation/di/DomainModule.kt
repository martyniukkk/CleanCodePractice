package com.cleancodepractice.presentation.di

import com.cleancodepractice.domain.usecase.GetNameUseCase
import com.cleancodepractice.domain.usecase.SaveNameUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetNameUseCase> {
        GetNameUseCase(userRepository = get())
    }

    factory<SaveNameUseCase> {
        SaveNameUseCase(userRepository = get())
    }

}