package com.groundzero.sport_now.ui.state

import android.view.View
import com.groundzero.sport_now.ui.state.animations.AnimateAllData
import com.groundzero.sport_now.ui.state.animations.AnimateExpandedMainImage
import com.groundzero.sport_now.ui.state.animations.AnimateStandard
import com.groundzero.sport_now.ui.state.visibility.VisibilityAllData
import com.groundzero.sport_now.ui.state.visibility.VisibilityExpandedMainImage
import com.groundzero.sport_now.ui.state.visibility.VisibilityStandard

class ShopState {

    private lateinit var state: State

    fun changeState(stateType: StateType) {
        when {
            stateType === StateType.ALL -> setState(AnimateAllData(VisibilityAllData()))
            stateType === StateType.EXPANDED -> setState(
                AnimateExpandedMainImage(
                    VisibilityExpandedMainImage()
                )
            )
            stateType === StateType.STANDARD -> setState(AnimateStandard(VisibilityStandard()))
        }
    }

    fun execute(itemSizeParent: View, recyclerParent: View) {
        state.changeState(itemSizeParent, recyclerParent)
    }

    private fun setState(state: State) {
        this.state = state
    }
}