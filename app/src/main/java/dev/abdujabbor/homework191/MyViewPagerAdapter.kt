package dev.abdujabbor.homework191

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyViewPagerAdapter(
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    val myFragmentList = ArrayList<Fragment>()

    override fun getCount(): Int {
        return myFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return myFragmentList[position]
    }

    fun addFragment(fragment: Fragment) {
        myFragmentList.add(fragment)
    }
}