package com.cleancodepractice.data.storage

import com.cleancodepractice.data.storage.model.StorageUserData

interface UserNameStorage {
    fun save(storageUserData: StorageUserData): Boolean
    fun get(): StorageUserData
}