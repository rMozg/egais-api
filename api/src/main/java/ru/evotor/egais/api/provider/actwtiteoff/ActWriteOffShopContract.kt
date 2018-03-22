package ru.evotor.egais.api.provider.actwtiteoff

import android.net.Uri
import ru.evotor.egais.api.provider.api.ActWriteOffShopApi

object ActWriteOffShopContract {
    @JvmField
    val PATH = "ActWriteOffShop"

    @JvmField
    val URI = Uri.withAppendedPath(ActWriteOffShopApi.BASE_URI, PATH)

    /**
     * Уникальный идентификатор акта списания из магазина
     */
    const val COLUMN_UUID = "UUID"

    /**
     * Отправитель акта списания из магазина
     */
    const val COLUMN_OWNER = "OWNER"

    /**
     * Идентификатор акта списания из магазина (клиентский, к заполнению необязательный)
     */
    const val COLUMN_IDENTITY = "IDENTITY"

    /**
     * Номер документа
     */
    const val COLUMN_NUMBER = "NUMBER"

    /**
     * Дата составления
     */
    const val COLUMN_ACT_DATE = "ACT_DATE"

    /**
     * Причина списания (Пересортица/Недостача/Уценка/Порча/Потери/Проверки/Арест/Иные цели/Реализация)
     */
    const val COLUMN_TYPE_ACT_WRITE_OFF = "TYPE_ACT_WRITE_OFF"

    /**
     * Примечание
     */
    const val COLUMN_NOTE = "NOTE"

    /**
     * Статус акта списания
     */
    const val COLUMN_STATUS = "STATUS"

    /**
     * Комментарий для отказа на акт списания из зала
     */
    const val COLUMN_REJECT_COMMENT = "REJECT_COMMENT"

}