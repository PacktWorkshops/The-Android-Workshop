package com.example.planetfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


const val QUESTION_ID = "QUESTION_ID"
const val ANSWER_ID = "ANSWER_ID"

interface AnswerListener {
    fun onSelected(questionId: Int, answerId: Int)
}


class MainActivity : AppCompatActivity(), AnswerListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSelected(questionId: Int, answerId: Int) {

        fragment_container?.let {frameLayout ->

            val answersFragment = AnswersFragment.newInstance(questionId, answerId)

            supportFragmentManager.beginTransaction()
                .replace(frameLayout.id, answersFragment)
                .addToBackStack(null)
                .commit()
        }
    }


}
