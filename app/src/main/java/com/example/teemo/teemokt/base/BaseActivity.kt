package com.example.teemo.teemokt.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by 63531 on 2018/4/2.
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayout())
        initView()
        initData()
    }

    abstract fun getLayout(): Int

    abstract fun initView()

    abstract fun initData()
}
