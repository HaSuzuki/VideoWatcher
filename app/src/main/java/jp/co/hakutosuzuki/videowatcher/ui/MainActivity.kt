package jp.co.hakutosuzuki.videowatcher.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.co.hakutosuzuki.videowatcher.R
import jp.co.hakutosuzuki.videowatcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil
                .setContentView<ActivityMainBinding>(
                        this,
                        R.layout.activity_main
                )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(binding.toolbar)
        setActionBar()
        setFragment()
    }

    private fun setActionBar() {
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setDisplayShowTitleEnabled(false)
        }
    }

    private fun setFragment() {
        supportFragmentManager.beginTransaction()
                .replace(binding.content.id, VideoPageFragment())
                .commit()
    }
}