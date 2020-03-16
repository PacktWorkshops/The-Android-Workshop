package com.example.fragmentstablets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


interface StarSignListener {
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), StarSignListener {

    var isDualPane: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isDualPane = star_sign_detail?.isInLayout ?: false
    }

    override fun onSelected(id: Int) {

        if (isDualPane) {
            DetailFragment.newInstance(id)
        }
        else {

        }

    }
}
