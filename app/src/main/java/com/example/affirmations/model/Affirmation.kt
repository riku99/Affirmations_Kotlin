package com.example.affirmations.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes

// dataキーワードをつけることにより、データクラスとなり最低1つのプロパティが必要になる
// @StringResなどのリソースアノテーションにより、指定したリソースのIDのみに限定される
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )