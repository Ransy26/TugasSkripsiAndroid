package com.example.tugasskripsi.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tugasskripsi.R
import com.example.tugasskripsi.adapters.HomeViewpagerAdapter
import com.example.tugasskripsi.databinding.FragmentHomeBinding
import com.example.tugasskripsi.fragments.categories.*
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf(
            MainCategoryFragment(),
            MagazineFragment(),
            AlbumFragment(),
            CollectablesFragment(),
            LightstickFragment(),
            PhotobookFragment()
        )

        binding.viewpagerHome.isUserInputEnabled = false

        val viewPager2Adapter =
            HomeViewpagerAdapter(categoriesFragments, childFragmentManager, lifecycle)
        binding.viewpagerHome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerHome) { tab, position ->
            when (position) {
                0 -> tab.text = "Main"
                1 -> tab.text = "Magazine"
                2 -> tab.text = "Album"
                3 -> tab.text = "Collectables"
                4 -> tab.text = "Lightstick"
                5 -> tab.text = "Photobook"
            }
        }.attach()
    }
}