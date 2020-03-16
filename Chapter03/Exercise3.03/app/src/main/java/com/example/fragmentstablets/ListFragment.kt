package com.example.fragmentstablets

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment(), View.OnClickListener {

    lateinit var starSignListener: StarSignListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        starSignListener = context as StarSignListener
    }

    override fun onClick(view: View?) {

        view?.let { starSign ->
            starSignListener.onSelected(starSign.id)
        }
    }

}
