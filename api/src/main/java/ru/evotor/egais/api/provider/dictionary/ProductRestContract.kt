package ru.evotor.egais.api.provider.dictionary

import android.net.Uri

internal object ProductRestContract {
    val PATH = "ProductRest"
    val URI = Uri.withAppendedPath(DictionaryContract.BASE_URI, PATH)

    /**
     * Количество продукции на складе
     */
    const val COLUMN_STOCK_QUANTITY = "STOCK_QUANTITY"

    /**
     * Количество продукции в торговом зале
     */
    const val COLUMN_SHOP_QUANTITY = "SHOP_QUANTITY"

    /**
     * Общее количество продукции
     */
    const val COLUMN_TOTAL_QUANTITY = "TOTAL_QUANTITY"
}
