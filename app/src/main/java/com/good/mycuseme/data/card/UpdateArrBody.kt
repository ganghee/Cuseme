package com.good.mycuseme.data.card

data class UpdateArrBody(
    val updateArr: MutableList<UpdateArr>
)

class UpdateArr(
    val cardIdx: Int,
    val visible: Boolean,
    val sequence: Int
)