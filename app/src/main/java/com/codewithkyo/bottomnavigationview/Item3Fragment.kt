package com.codewithkyo.bottomnavigationview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Use the [Item3Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Item3Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return  inflater.inflate(R.layout.fragment_item3, container, false)
    }
}
