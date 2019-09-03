package com.groundzero.sport_now.ui.state.animations

import android.view.View
import com.groundzero.sport_now.ui.state.State

class AnimateStandard(private val visibilityState: State) : State {

    override fun changeState(itemSizeParent: View, recyclerParent: View) {
        // Animate and change visibility
        visibilityState.changeState(itemSizeParent, recyclerParent)
    }
}