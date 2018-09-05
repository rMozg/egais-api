package ru.evotor.egais.api.provider.reply

import android.net.Uri
import ru.evotor.egais.api.provider.MainContract

internal object MarkRestContract {
    const val AUTHORITY = "${MainContract.AUTHORITY_PREFIX}.markrest"

    @JvmField
    val BASE_URI = Uri.parse("content://${AUTHORITY}")

    val PATH = "MarkRest"
    val URI = Uri.withAppendedPath(BASE_URI, PATH)

    /**
     * UUID документа основания
     */
    const val COLUMN_DOCUMENT_UUID = "DOCUMENT_UUID"

    /**
     * Регистрационный номер раздела справки Б
     */
    const val COLUMN_NAME_INFORM_B_REG_ID = "INFORM_B_REG_ID"

    /**
     * Марка
     */
    const val COLUMN_MARK = "MARK"
}