package dev.abdujabbor.homework191

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.viewpager.widget.ViewPager
import dev.abdujabbor.homework191.databinding.ActivityMainBinding
import dev.abdujabbor.homework191.fragments.AddMeFragment
import dev.abdujabbor.homework191.fragments.BookbybehindFragment
import dev.abdujabbor.homework191.fragments.WelcomeFragment
import dev.abdujabbor.homework191.fragments.WorldFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(WelcomeFragment())
        adapter.addFragment(BookbybehindFragment())
        adapter.addFragment(WorldFragment())
        adapter.addFragment(AddMeFragment())
        binding.myViewPager.adapter =adapter
        binding.next.setOnClickListener {
            binding.myViewPager.setCurrentItem(binding.myViewPager.currentItem + 1, true)
        }
        binding.myViewPager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
             when(position){
                 2->{
                     next.isVisible = true
                 }
                 3->{
                         next.isVisible = false
                 }
             }
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        binding.myCircleIndicatior.setViewPager(binding.myViewPager)

        setContentView(binding.root)
    }
}
