package com.example.viewpagerapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  tablayout = findViewById<TabLayout>(R.id.tablayout)
        val ViewPager = findViewById<ViewPager>(R.id.ViewPager)
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)


        pagerAdapter.fragments.add(ChatFragment())
        pagerAdapter.fragments.add(callFragment())
        pagerAdapter.titles.add("Chat")
        pagerAdapter.titles.add("Call")
        ViewPager.adapter = pagerAdapter
        tablayout.setupWithViewPager(ViewPager)


    }
}