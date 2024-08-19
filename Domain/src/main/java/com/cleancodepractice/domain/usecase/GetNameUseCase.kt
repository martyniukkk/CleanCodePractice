package com.cleancodepractice.domain.usecase

import com.cleancodepractice.domain.model.UserData
import com.cleancodepractice.domain.repository.UserRepository

class GetNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserData {
        return userRepository.getName()
    }

}