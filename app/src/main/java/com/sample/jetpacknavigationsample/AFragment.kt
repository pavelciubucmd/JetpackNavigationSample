package com.sample.jetpacknavigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_a.*

class AFragment : Fragment() {

    private val args: AFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textA.text = args.previousScreen

        //pass data with safeArgs
        buttonA.setOnClickListener {
            val action = AFragmentDirections
                .actionAFragmentToBFragment("Previous screen was A \n Current is B")

            findNavController().navigate(action)
        }

        //navigate by destinations's id
//        buttonA.setOnClickListener {
//            findNavController().navigate(R.id.BFragment)
//        }

        //navigate by actions's id
//        buttonA.setOnClickListener {
//            findNavController().navigate(R.id.action_AFragment_to_BFragment)
//        }

        //navigate with navOptions
//        buttonA.setOnClickListener {
//            val navOptions = NavOptions.Builder()
//                .setEnterAnim(R.anim.slide_in_right)
//                .setExitAnim(R.anim.slide_out_left)
//                .setPopEnterAnim(R.anim.slide_in_left)
//                .setPopExitAnim(R.anim.slide_out_right)
//                .build()
//
//            findNavController().navigate(R.id.action_AFragment_to_BFragment, null, navOptions)
//        }

        //pass data with bundle objects
//        buttonA.setOnClickListener {
//            findNavController().navigate(
//                R.id.action_AFragment_to_BFragment,
//                bundleOf(Pair("key", "This is value passed with bundle"))
//            )
//        }
    }
}
