package com.gonzo.myapplication.base

interface BasePresenter <T>{

    fun inputView(view : T)
    fun outputView()
}