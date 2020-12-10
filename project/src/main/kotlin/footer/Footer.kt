package footer

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.*

class Footer: RComponent<RProps, RState>()  {

    override fun RBuilder.render() {
        styledFooter {
            css{
                position = Position.fixed
                width = 100.vw
                display = Display.flex
                flexDirection = FlexDirection.rowReverse
                bottom = 1.vmin
                height= 2.vmin
            }
            styledDiv {
                css{
                    width = 20.pct
                    display = Display.flex
                    alignItems = Align.center
                }

                styledSpan {
                    +"Built by myself using"
                    css {
                        fontWeight = FontWeight.bolder
                        color = Color.white
                        fontFamily = "system-ui"
                        fontSize = 1.vmin
                        marginRight = 0.5.vmin

                    }
                }
                styledImg {
                    attrs { src="images/kotlin.png" }
                    css{
                        maxHeight=1.05.vmin
                        +ComponentStyles.tint
                    }
                }
            }
        }
    }
}
