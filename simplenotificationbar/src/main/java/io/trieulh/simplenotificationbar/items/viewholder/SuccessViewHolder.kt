package io.trieulh.simplenotificationbar.items.viewholder

import android.view.ViewGroup
import android.widget.TextView
import io.trieulh.simplenotificationbar.R
import io.trieulh.simplenotificationbar.SimpleNotificationConfig
import io.trieulh.simplenotificationbar.SimpleNotificationArg
import io.trieulh.simplenotificationbar.items.SimpleNotificationViewHolder

internal class SuccessViewHolder(parent: ViewGroup, barConfig: SimpleNotificationConfig) :
    SimpleNotificationViewHolder<SimpleNotificationArg.Success>(
        parent,
        R.layout.view_simple_notification_success,
        barConfig
    ) {
    override fun bindContent(item: SimpleNotificationArg) {
        if (item !is SimpleNotificationArg.Success) return
        itemView.findViewById<TextView>(R.id.txt_content)?.apply {
            text = item.content
        }
    }
}