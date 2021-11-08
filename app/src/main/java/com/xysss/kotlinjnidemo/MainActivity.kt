package com.xysss.kotlinjnidemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xysss.kotlinjnidemo.databinding.ActivityMainBinding
import jni.JniKit

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sampleText.text = JniKit.stringFromJNI()
    }
}