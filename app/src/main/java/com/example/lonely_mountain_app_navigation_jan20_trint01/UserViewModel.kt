package com.example.lonely_mountain_app_navigation_jan20_trint01

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {


    private var _user : MutableLiveData<List<User>> = MutableLiveData()
    val user : LiveData<List<User>> get() = _user

    private val userList : MutableList<User> = mutableListOf()

    fun addUser(user : User) {
        userList.add(user)
        _user.value = userList
    }

//    override fun toString() {
//        private val listOfUsers = this.user
//
//        return listOfUsers
//    }
}