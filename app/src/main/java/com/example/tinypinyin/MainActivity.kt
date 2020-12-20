package com.example.tinypinyin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.promeg.pinyinhelper.Pinyin
import com.github.promeg.tinypinyin.lexicons.android.cncity.CnCityDict
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dictionary API

        Pinyin.init(Pinyin.newConfig().with(CnCityDict.getInstance(this)))

        textview.setOnClickListener {
            textview.text = Pinyin.toPinyin("中国", "")
            Log.d(TAG, "onCreate: ${Pinyin.toPinyin("中国", "")} **********")
        }
    }
}
