package com.cleancodepractice.domain.usecase

import com.cleancodepractice.domain.model.UserData
import com.cleancodepractice.domain.repository.UserRepository

class SaveNameUseCase(private val userRepository: UserRepository) {

    fun execute(userData: UserData): Boolean {
        return if (userData.name.isEmpty()) {
            false
        } else {
            userRepository.saveName(userData = userData)
        }
    }

}