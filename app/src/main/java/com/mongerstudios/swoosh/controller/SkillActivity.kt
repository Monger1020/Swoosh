package com.mongerstudios.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.mongerstudios.swoosh.utilities.EXTRA_LEAGUE
import com.mongerstudios.swoosh.R
import com.mongerstudios.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Log.d("Passed League: ",league)
    }

    fun FinishClicked(view: View){
        if(skill != "" && league != ""){
            val finishedActivity = Intent(this, FinishActivity::class.java)

            finishedActivity.putExtra(EXTRA_LEAGUE, league)
            finishedActivity.putExtra(EXTRA_SKILL, skill)

            startActivity(finishedActivity)
        }else{
            Toast.makeText(this,"Please Select a skill level first", Toast.LENGTH_SHORT).show()
        }
    }

    fun BallerClicked(view: View){
        btnBeginner.isChecked = false
        skill = btnBaller.text.toString()
    }
    fun BeginnerClicked(view:View){
        btnBaller.isChecked = false
        skill = btnBeginner.text.toString()
    }
}
