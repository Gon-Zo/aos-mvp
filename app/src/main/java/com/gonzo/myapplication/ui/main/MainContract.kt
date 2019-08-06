package com.gonzo.myapplication.ui.main

import com.gonzo.myapplication.base.BasePresenter
import com.gonzo.myapplication.base.BaseView

interface MainContract {

    interface View : BaseView{

    }

    interface Presenter : BasePresenter<View>{

    }
}