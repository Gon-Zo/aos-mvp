package com.gonzo.myapplication.ui.main

class MainPresenter : MainContract.Presenter {

    private var mainView : MainContract.View ?= null


    override fun inputView(view: MainContract.View) {
        this.mainView = view
    }

    override fun outoutView() {
        this.mainView = null
    }
}