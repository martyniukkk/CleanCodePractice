package com.cleancodepractice.domain.repository

import com.cleancodepractice.domain.model.UserData

interface UserRepository {
    fun saveName(userData: UserData): Boolean
    fun getName(): UserData
}