package com.mongerstudios.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mongerstudios.swoosh.R
import com.mongerstudios.swoosh.controller.Model.Player
import com.mongerstudios.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    //var selectedLeague = ""
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player  = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun LeagueNextClicked(view: View){
        //transition to Next View
        if(player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Select a League first",Toast.LENGTH_SHORT).show()
        }
    }

    //Togle button logic functions
    fun OnMensClicked(view: View){
        btnWomens.isChecked = false
        btnCoed.isChecked = false
        player.league = "Mens"
    }

    fun OnWomensClicked(view:View){
        btnMens.isChecked = false
        btnCoed.isChecked = false
        player.league = "Womens"
    }

    fun OnCoedClicked(view: View){
        btnMens.isChecked = false
        btnWomens.isChecked = false
        player.league = "Co-Ed"
    }
}
