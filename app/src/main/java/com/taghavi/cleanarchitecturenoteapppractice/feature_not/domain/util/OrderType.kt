package com.taghavi.cleanarchitecturenoteapppractice.feature_not.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}