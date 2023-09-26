package com.example.viewpagerapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter (fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){
    val fragments: MutableList<Fragment> = ArrayList()
    val titles: MutableList<String> =ArrayList()


    override fun getCount(): Int {
       return fragments.size
    }


    override fun getItem(position: Int): Fragment {
       return fragments[position]
    }
    override fun getPageTitle(position: Int): CharSequence? {
       return titles[position]
    }
}