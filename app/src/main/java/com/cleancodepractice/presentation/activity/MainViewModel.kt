package com.cleancodepractice.presentation.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cleancodepractice.domain.usecase.GetNameUseCase
import com.cleancodepractice.domain.usecase.SaveNameUseCase

class MainViewModel(
    private val getNameUseCase: GetNameUseCase,
    private val saveNameUseCase: SaveNameUseCase,
) : ViewModel() {

    private val resultMutableLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String> = resultMutableLiveData

    fun get() {
        val userData = getNameUseCase.execute()
        resultMutableLiveData.value = userData.name
    }

    fun save(name: String) {
        val userData = com.cleancodepractice.domain.model.UserData(name = name)
        val saveResult = saveNameUseCase.execute(userData)
        resultMutableLiveData.value = "Result is $saveResult"
    }

}