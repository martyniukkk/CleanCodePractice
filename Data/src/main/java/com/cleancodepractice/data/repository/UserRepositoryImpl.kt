package com.cleancodepractice.data.repository

import com.cleancodepractice.data.storage.UserNameStorage
import com.cleancodepractice.data.storage.model.StorageUserData
import com.cleancodepractice.domain.model.UserData
import com.cleancodepractice.domain.repository.UserRepository

class UserRepositoryImpl(private val userNameStorage: UserNameStorage) :
    UserRepository {

    override fun saveName(userData: UserData): Boolean {
        val storageUserData = StorageUserData(name = userData.name)
        userNameStorage.save(storageUserData)
        return true
    }

    override fun getName(): UserData {
        val storageUserData = userNameStorage.get()
        return UserData(storageUserData.name)
    }

}