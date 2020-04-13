package com.mongerstudios.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.mongerstudios.swoosh.R
import com.mongerstudios.swoosh.controller.Model.Player
import com.mongerstudios.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Log.d("Player: ",player.league)
    }

    fun FinishClicked(view: View){
        if(player.skill != "" && player.league != ""){
            val finishedActivity = Intent(this, FinishActivity::class.java)
            finishedActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishedActivity)
        }else{
            Toast.makeText(this,"Please Select a skill level first", Toast.LENGTH_SHORT).show()
        }
    }

    fun BallerClicked(view: View){
        btnBeginner.isChecked = false
        player.skill = btnBaller.text.toString()
    }
    fun BeginnerClicked(view:View){
        btnBaller.isChecked = false
        player.skill = btnBeginner.text.toString()
    }
}
