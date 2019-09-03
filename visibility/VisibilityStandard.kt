package com.groundzero.sport_now.ui.state.visibility

import android.view.View
import com.groundzero.sport_now.ui.state.State

class VisibilityStandard : State {
    override fun changeState(itemSizeParent: View, recyclerParent: View) {
        itemSizeParent.visibility = View.GONE
        recyclerParent.visibility = View.VISIBLE
    }
}