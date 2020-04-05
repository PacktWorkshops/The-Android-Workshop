package com.example.planetfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class AnswersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_answers, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(questionId: Int, answerId: Int) =
            AnswersFragment().apply {

                arguments = Bundle().apply {
                    putInt(QUESTION_ID, questionId)
                    putInt(ANSWER_ID, answerId)
                }

            }
    }


}