package uz.behzoddev.viewpager2sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import uz.behzoddev.viewpager2sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Create the object of ViewPager2
    private lateinit var viewPager2: ViewPager2
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager2Adapter: ViewPager2Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewPager2()
        registerOnPageChange()
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterOnPageChange()
    }
    private fun setupViewPager2() = with(binding) {
        viewPager2 = viewPager
        viewPager2Adapter = ViewPager2Adapter(this@MainActivity)
        viewPager2.adapter = viewPager2Adapter
    }

    private fun registerOnPageChange() {
        // To get swipe event of viewPager2
        viewPager2.registerOnPageChangeCallback(samplePageChangeCallback)
    }
    private fun unregisterOnPageChange() {
        viewPager2.unregisterOnPageChangeCallback(samplePageChangeCallback)
    }

    // Before
    /*
    * viewPager2.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback()
    * {
    *  override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
        }

        override fun onPageScrollStateChanged(state: Int) {
            super.onPageScrollStateChanged(state)
        }
    * }
    * )
    * */
    // After
    private val samplePageChangeCallback = object: ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
        }

        override fun onPageScrollStateChanged(state: Int) {
            super.onPageScrollStateChanged(state)
        }
    }
}