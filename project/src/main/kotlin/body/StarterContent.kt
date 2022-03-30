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
                    put("text-shadow","0.70vmin 0.70vmin ${Color.black.value}")
                    +ComponentStyles.content
                }
            }

            styledH1 {
                +"Interested in developing Fullstack web apps, Android apps and Data Engineering pipelines."
                css {
                    fontWeight= FontWeight.bold
                    fontSize= 2.vmin
                    fontFamily = "system-ui"
                    put("text-shadow","0.5vmin 0.5vmin ${Color.black.value}")
                    +ComponentStyles.content
                }
            }
            css{
                marginBottom=2.vmin // Some spacing
            }
        }
    }
}
