package com.lambdaschool.congressfragmentsproject.fragments.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.congressfragmentsproject.R
import com.lambdaschool.congressfragmentsproject.api.CongresspersonOverview
import com.lambdaschool.congressfragmentsproject.fragments.CongresspersonOverviewFragment
import com.lambdaschool.congressfragmentsproject.fragments.DetailsFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_two.*

class ActivityTwo : AppCompatActivity(), CongresspersonOverviewFragment.OnListFragmentInteractionListener,
    DetailsFragment.OnFragmentInteractionListener  {
    override fun onFragmentInteraction() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onListFragmentInteraction(item: CongresspersonOverview) {




   /*     if(secondary_fragment_holder_two == null) {*/

   /*     } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.secondary_fragment_holder_two, fragment)
                .commit()
        }*/

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)


/*        val fragment = CongresspersonOverviewFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_holder_two, fragment)
            .commit()*/
        val fragment = DetailsFragment()

        val bundle = Bundle()
        bundle.putString(MainActivity.ITEM_KEY, )

        //fragment.arguments = bundle
        fragment.setArguments(bundle)
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_holder_two, fragment)
            .addToBackStack("yus")
            .commit()
    }
}
