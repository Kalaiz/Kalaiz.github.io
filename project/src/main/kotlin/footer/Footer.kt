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
                position = Position.absolute
                width=100.pct
                bottom=0.px
                display= Display.flex
                flexDirection=FlexDirection.rowReverse
                height=5.vmin
            }
            styledDiv {
                css{
                    width=15.pct
                    display=Display.flex
                    alignItems=Align.center
                }

                styledSpan {
                    +"Built by myself using"
                    css {
                        fontWeight = FontWeight.bolder
                        color = Color.white
                        fontFamily= "system-ui"
                        fontSize=1.vmin
                        marginRight=0.5.vmin
                    }
                }
                styledImg {
                    attrs { src="images/kotlin.png" }
                    css{
                        maxWidth= 20.pct
                        maxHeight = 20.pct
                        filter="brightness(0) saturate(100%) invert(100%) sepia(100%) saturate(0%) hue-rotate(8deg) brightness(105%) contrast(101%)"
                    }
                }
            }
        }
    }
}
