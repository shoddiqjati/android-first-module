package com.emon.progressloading

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.layout_mask.view.*

class ProgressLoading @JvmOverloads constructor(ctx: Context,
                                                attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(ctx, attrs, defStyleAttr) {

    init {
        inflate(ctx, R.layout.layout_mask, this)

        context.theme.obtainStyledAttributes(attrs, R.styleable.ProgressLoading, defStyleAttr, 0).apply {
            textLoading.text = getString(R.styleable.ProgressLoading_textLoading)
        }
    }
}