package com.tiyas.mydeepnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tiyas.mydeepnavigation.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var  detailBinding: ActivityDetailBinding

    companion object{
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_MESSAGE = "extra_message"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val message  = intent.getStringExtra(EXTRA_MESSAGE)

        detailBinding.tvTitle.text = title
        detailBinding.tvMessage.text = message
    }
}