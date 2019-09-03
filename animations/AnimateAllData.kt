package com.groundzero.sport_now.ui.state.animations

import android.view.View
import com.groundzero.sport_now.ui.state.ShopStateDecorator
import com.groundzero.sport_now.ui.state.State

class AnimateAllData(private val visibilityState: State) : ShopStateDecorator(visibilityState) {

    override fun changeState(itemSizeParent: View, recyclerParent: View) {
        // Animate and change visibility
        visibilityState.changeState(itemSizeParent, recyclerParent)
    }
}