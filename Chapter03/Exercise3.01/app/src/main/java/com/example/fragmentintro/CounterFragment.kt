package com.example.fragmentintro

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_style.*

/**
 * A simple [Fragment] subclass.
 */
class CounterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onResume() {
        super.onResume()

        add.setOnClickListener {
            var counterValue = counter.text.toString().toInt()
            counter.text = (++counterValue).toString()
        }

        minus.setOnClickListener {
            var counterValue = counter.text.toString().toInt()
            if (counterValue > 0) counter.text = (--counterValue).toString()
        }
    }

}
