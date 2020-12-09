package body

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv
import styled.styledH1


class StarterContent: RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            styledH1 {
                +"Hi! I am Kalai."
                css {
                    fontWeight = FontWeight.bold
                    fontSize = 9.5.vmin
                    fontFamily = "\"Lucida Console\", \"Courier New\", monospace"
                    marginBottom = 0.px
                    +ComponentStyles.content
                }
            }

            styledH1 {
                +"Software Engineering Student | Android | Linux "
                css {
                    fontWeight= FontWeight.bold
                    fontSize= 2.5.vmin
                    fontFamily = "system-ui"
                    +ComponentStyles.content
                }
            }
            css{
                marginBottom=2.vmin // Some spacing
            }
        }
    }
}
