package com.maxrave.data.repository

import com.maxrave.domain.data.model.cookie.CookieItem

actual fun getCookies(url: String, packageName: String): CookieItem = CookieItem(url, emptyList())