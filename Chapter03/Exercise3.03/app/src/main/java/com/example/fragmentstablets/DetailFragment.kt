package com.example.fragmentstablets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail.*

private const val STAR_SIGN_ID = "STAR_SIGN_ID"

class DetailFragment : Fragment() {

    private var starSignId: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            starSignId = it.getInt(STAR_SIGN_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        starSignId?.let { id ->

            //All text below should in production be string resources, done as hardcoded text here for simplicity
            when (id) {
                R.id.aquarius -> {
                    star_sign.text = getString(R.string.aquarius)
                    symbol.text = "Water Carrier"
                    date_range.text = "January 20 - February 18"
                }
                R.id.pisces -> {
                    star_sign.text = getString(R.string.pisces)
                    symbol.text = "Fish"
                    date_range.text = "February 19 - March 20"
                }
                R.id.aries -> {
                    star_sign.text = getString(R.string.aries)
                    symbol.text = "Ram"
                    date_range.text = "March 21 - April 19"
                }
                R.id.taurus -> {
                    star_sign.text = getString(R.string.taurus)
                    symbol.text = "Bull"
                    date_range.text = "April 20 - May 20"
                }
                R.id.gemini -> {
                    star_sign.text = getString(R.string.gemini)
                    symbol.text = "Twins"
                    date_range.text = "May 21 - June 20"
                }
                R.id.cancer -> {
                    star_sign.text = getString(R.string.cancer)
                    symbol.text = "Crab"
                    date_range.text = "June 21 - July 22"
                }
                R.id.leo  -> {
                    star_sign.text = getString(R.string.capricorn)
                    symbol.text = "Lion"
                    date_range.text = "July 23 - August 22"
                }
                R.id.virgo  -> {
                    star_sign.text = getString(R.string.virgo)
                    symbol.text = "Virgin"
                    date_range.text = "August 23 - September 22"
                }
                R.id.libra  -> {
                    star_sign.text = getString(R.string.libra)
                    symbol.text = "Scales"
                    date_range.text = "September 23 - October 22"
                }
                R.id.scorpio  -> {
                    star_sign.text = getString(R.string.scorpio)
                    symbol.text = "Scorpion"
                    date_range.text = "October 23 - November 21"
                }
                R.id.sagittarius -> {
                    star_sign.text = getString(R.string.sagittarius)
                    symbol.text = "Archer"
                    date_range.text = "November 22 - December 21"
                }
                R.id.capricorn -> {
                    star_sign.text = getString(R.string.capricorn)
                    symbol.text = "Mountain Goat"
                    date_range.text = "December 22 - January 19"
                }
            }
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(starSignId: Int) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(STAR_SIGN_ID, starSignId)
                }
            }
    }
}
