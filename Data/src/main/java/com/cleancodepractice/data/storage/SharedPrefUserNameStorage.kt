package com.cleancodepractice.data.storage

import android.content.Context
import com.cleancodepractice.data.storage.model.StorageUserData

private const val DB_NAME = "user_db"
private const val NAME_KEY = "user_name"

class SharedPrefUserNameStorage(context: Context) : UserNameStorage {

    private val sharedPreferences = context.getSharedPreferences(DB_NAME, Context.MODE_PRIVATE)

    override fun save(storageUserData: StorageUserData): Boolean {
        sharedPreferences.edit().putString(NAME_KEY, storageUserData.name).apply()
        return true
    }

    override fun get(): StorageUserData {
        return StorageUserData(name = sharedPreferences.getString(NAME_KEY, "").toString())
    }

}