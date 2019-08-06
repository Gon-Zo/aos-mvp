package com.gonzo.myapplication.ui.main

import android.os.Bundle
import android.widget.Toast
import com.gonzo.myapplication.R
import com.gonzo.myapplication.base.BaseActivity

class MainActivity : BaseActivity() , MainContract.View{
    
    private lateinit var mainPresenter: MainPresenter

    override var layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainPresenter.inputView(this)
    }

    override fun initPresenter() {
        mainPresenter = MainPresenter()
    }

    override fun onError(msg: String) {
        Toast.makeText(this , "[ ERROR MSG >> $msg ]" , Toast.LENGTH_LONG).show()
    }

}
