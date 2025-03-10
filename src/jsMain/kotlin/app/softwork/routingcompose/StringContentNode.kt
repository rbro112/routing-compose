package app.softwork.routingcompose

import androidx.compose.runtime.*

public class StringContentNode : ContentNode() {
    public lateinit var content: @Composable (String) -> Unit

    override fun matches(subRoute: String): Boolean = subRoute.isNotEmpty()

    @Composable
    override fun display(argument: String) {
        content(argument)
    }
}