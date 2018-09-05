package ru.evotor.egais.api.query

import ru.evotor.egais.api.model.dictionary.MarkRest
import ru.evotor.egais.api.provider.reply.MarkRestContract
import ru.evotor.query.Cursor
import ru.evotor.query.FilterBuilder
import java.util.*

/**
 * Класс для формирования запроса на получение информации о марках на 3-м регистре
 */
class MarkRestQuery : FilterBuilder<MarkRestQuery, MarkRestQuery.SortOrder, MarkRest>(MarkRestContract.URI) {


    /**
     * UUID документа основания
     */
    @JvmField
    val docUuid = addFieldFilter<UUID>(MarkRestContract.COLUMN_DOCUMENT_UUID)

    /**
     * Регистрационный номер раздела справки Б
     */
    @JvmField
    val informBRegId = addFieldFilter<UUID>(MarkRestContract.COLUMN_NAME_INFORM_B_REG_ID)

    /**
     * Марка
     */
    @JvmField
    val mark = addFieldFilter<UUID>(MarkRestContract.COLUMN_MARK)

    override val currentQuery: MarkRestQuery
        get() = this

    /**
     * Класс для сортировки полей в результе запроса
     */
    class SortOrder : FilterBuilder.SortOrder<SortOrder>() {

        /**
         * UUID документа основания
         */
        @JvmField
        val docUuid = addFieldSorter(MarkRestContract.COLUMN_DOCUMENT_UUID)

        /**
         * Регистрационный номер раздела справки Б
         */
        @JvmField
        val informBRegId = addFieldSorter(MarkRestContract.COLUMN_NAME_INFORM_B_REG_ID)

        /**
         * Марка
         */
        @JvmField
        val mark = addFieldSorter(MarkRestContract.COLUMN_MARK)

        override val currentSortOrder: SortOrder
            get() = this
    }

    override fun getValue(cursor: Cursor<MarkRest>): MarkRest {
        return createMarkRest(cursor)
    }

    private fun createMarkRest(cursor: android.database.Cursor): MarkRest {
        val columnIndexDocUuid = cursor.getColumnIndex(MarkRestContract.COLUMN_DOCUMENT_UUID)
        val columnIndexInformBRegId = cursor.getColumnIndex(MarkRestContract.COLUMN_NAME_INFORM_B_REG_ID)
        val columnIndexMark = cursor.getColumnIndex(MarkRestContract.COLUMN_MARK)
        return MarkRest(
                UUID.fromString(cursor.getString(columnIndexDocUuid)),
                cursor.getString(columnIndexInformBRegId),
                cursor.getString(columnIndexMark)
        )
    }
}