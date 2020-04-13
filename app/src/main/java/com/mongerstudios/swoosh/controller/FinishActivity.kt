package com.mongerstudios.swoosh.controller

import android.os.Bundle
import android.util.Log
import com.mongerstudios.swoosh.R
import com.mongerstudios.swoosh.controller.Model.Player
import com.mongerstudios.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        Log.d("Player: ", player.league )
        Log.d("Player: ", player.skill )

        txtLookingFor.text = "Looking for a ${player.league} ${player.skill} league near you"
    }
}
