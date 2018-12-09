package com.example.paramvir.testpracticesample.dagger.dzoneEample

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.paramvir.testpracticesample.R
import kotlinx.android.synthetic.main.activity_dagger_practice.*

class DaggerPracticeActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_practice)

        val body = createBodySimple()
        textView.text = "Kind of blood is = ${body.getBlood().kindOfBlood}"
    }
    /*  fun createBody():Body{
         val doctor = DaggerDoctor.create();
         return doctor.injectBlood();

     }*/

    fun createBodySimple(): Body {
        val blood = RandomInjectionModule.provideBlood()
        val body = Body()
        body.blood = blood
        return body
    }

}
