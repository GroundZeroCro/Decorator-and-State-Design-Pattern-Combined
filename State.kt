package com.groundzero.sport_now.ui.state

import android.view.View

interface State {
    fun changeState(itemSizeParent: View, recyclerParent: View)
}