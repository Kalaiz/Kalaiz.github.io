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
                    fontWeight= FontWeight.bold
                    fontSize= 9.5.vmin
                    color = Color.whiteSmoke
                    fontFamily = "Courier New"
                    textAlign= TextAlign.center
                    height= LinearDimension.fitContent
                    marginBottom=0.px
                    put("text-shadow","5px 5px ${Color.black.value}")
                }
            }

            styledH1 {
                +"Software Engineering Student | Android | Linux "

                css {
                    fontWeight= FontWeight.bolder
                    fontSize= 2.5.vmin
                    color = Color.whiteSmoke
                    fontFamily = "system-ui"
                    textAlign= TextAlign.center
                    height= LinearDimension.fitContent
                    put("text-shadow","5px 5px ${Color.black.value}")
                }
            }
            css{
                marginBottom=2.vmin
            }
        }
    }
}
