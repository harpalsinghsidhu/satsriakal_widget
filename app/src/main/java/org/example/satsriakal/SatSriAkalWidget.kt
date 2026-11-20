package org.example.satsriakal

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class SatSriAkalWidget : AppWidgetProvider() {
    override fun onUpdate(ctx: Context, mgr: AppWidgetManager, ids: IntArray) {
        for (id in ids) {
            mgr.updateAppWidget(id, RemoteViews(ctx.packageName, R.layout.widget_satsriakal))
        }
    }
}
