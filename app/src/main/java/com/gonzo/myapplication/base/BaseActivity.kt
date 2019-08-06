package com.gonzo.myapplication.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity  : AppCompatActivity(){

    abstract var layoutId : Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        initPresenter()
    }

    abstract fun initPresenter()
}