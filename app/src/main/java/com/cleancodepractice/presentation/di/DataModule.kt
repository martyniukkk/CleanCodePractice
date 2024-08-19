package com.cleancodepractice.presentation.di

import com.cleancodepractice.data.repository.UserRepositoryImpl
import com.cleancodepractice.data.storage.SharedPrefUserNameStorage
import com.cleancodepractice.data.storage.UserNameStorage
import com.cleancodepractice.domain.repository.UserRepository
import org.koin.dsl.module

val dataModule = module {

    single<UserNameStorage> {
        SharedPrefUserNameStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userNameStorage = get())
    }

}