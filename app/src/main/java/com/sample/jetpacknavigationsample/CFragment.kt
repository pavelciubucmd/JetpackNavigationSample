package com.sample.jetpacknavigationsample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_c.*

class CFragment : Fragment() {

    private val args: CFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_c, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textC.text = args.previousScreen

        buttonC.setOnClickListener {
            val action = CFragmentDirections
                .actionCFragmentToAFragment("Previous screen was C \n Stack was erased and now contains only A")

            findNavController().navigate(action)
        }
    }
}
