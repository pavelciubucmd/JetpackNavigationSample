package com.sample.jetpacknavigationsample

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavView.setupWithNavController(findNavController(R.id.nav_host_fragment))

        bottomNavView.setOnNavigationItemReselectedListener {
            //noop
        }


//        findNavController(R.id.nav_host_fragment).addOnDestinationChangedListener { _, destination, _ ->
//            bottomNavView.visibility = if (destination.id == R.id.BFragment) GONE else VISIBLE
//        }
    }
}
