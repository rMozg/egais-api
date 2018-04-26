package ru.evotor.egais.api.provider.transfer

import android.net.Uri

internal object TransferToShopPositionContract {
    val PATH = "TransferToShopPosition"
    val URI = Uri.withAppendedPath(TransferContract.BASE_URI, PATH)

    /**
     * Уникальный идентификатор документа передачи
     */
    const val COLUMN_TRANSFER_TO_SHOP_ID = "TRANSFER_TO_SHOP_ID"

    /**
     * Идентификатор позиции внутри акта
     */
    const val COLUMN_IDENTITY = "IDENTITY"

    /**
     * Регистрационный код продукции
     */
    const val COLUMN_PRODUCT_CODE = "PRODUCT_CODE"

    /**
     * Количество
     */
    const val COLUMN_QUANTITY = "QUANTITY"

    /**
     * Регистрационный номер раздела справки 2
     */
    const val COLUMN_INFORM_F2_REG_ID = "INFORM_F2_REG_ID"

    /**
     * Информация о марках в формате JSON
     */
    const val COLUMN_INFORM_F2_MARK_INFO_JSON = "INFORM_F2_MARK_INFO_JSON"

    /**
     * Алкокод информации о продукции
     */
    const val COLUMN_PRODUCT_INFO_ALC_CODE = "PRODUCT_INFO_ALC_CODE"
}