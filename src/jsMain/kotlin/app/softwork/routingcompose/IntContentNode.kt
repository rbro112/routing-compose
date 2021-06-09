package app.softwork.routingcompose

import androidx.compose.runtime.*

public class IntContentNode : ContentNode() {
    public lateinit var content: @Composable (Int) -> Unit

    override fun matches(subRoute: String): Boolean = subRoute.toIntOrNull() != null

    @Composable
    override fun display(subRoute: String) {
        val argument = subRoute.toInt()
        content(argument)
    }

    override fun toString(): String = "IntContentNode()"
}